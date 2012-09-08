package com.CardGame;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import android.R.bool;
import android.app.Activity;
import android.os.Bundle;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.SeekBar;
import android.widget.Spinner;

public class CardGameActivity extends Activity {
	ImageView img1;
	ImageView img2;
	ImageView img3;
	ImageView img4;
	ImageView img5;
	float startX;
	float startX2 ;
	boolean flip;
	Bitmap source;
	Bitmap bitmap1 = null;
	Bitmap bitmap2 = null;
	double r;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.main);
	    img1 = (ImageView) findViewById(R.id.imageview);
	    img2 = (ImageView) findViewById(R.id.imageview1);
	    img3 = (ImageView) findViewById(R.id.imageview2);
	    img4 = (ImageView) findViewById(R.id.imageview3);
	    img5 = (ImageView) findViewById(R.id.imageview4);
	    img1.setX(100);
	    img1.setY(100);
	    img2.setX(200);
	    img2.setY(200);
	    img3.setX(300);
	    img3.setY(300);
	    img1.setOnTouchListener(img1TouchListener);
	    img2.setOnTouchListener(img1TouchListener1);
	    img3.setOnTouchListener(img1TouchListener2);
	    img4.setOnTouchListener(img1TouchListener3);
	    img5.setOnTouchListener(img1TouchListener4);
	    
	    bitmap1 = BitmapFactory.decodeResource(getResources(), R.drawable.card);
	    flip = true;
	}

	private OnTouchListener img1TouchListener = new OnTouchListener()
	{
	    @Override
	    public boolean onTouch(View v, MotionEvent event)
	    {
	    	System.out.println("sundi img1"  );
	    	img1 = (ImageView) findViewById(R.id.imageview);
		    img1.setOnTouchListener(img1TouchListener);

		    bitmap1 = BitmapFactory.decodeResource(getResources(), R.drawable.card);
		    bitmap2 = BitmapFactory.decodeResource(getResources(), R.drawable.jackred);
		    Matrix matrix = new Matrix();
		    source = Bitmap.createBitmap(bitmap1, 0, 0, bitmap1.getWidth(), bitmap1.getHeight(), matrix, false);
	        switch (event.getAction())
	        {
	            case MotionEvent.ACTION_MOVE:
	                Log.d("MOVE", "1");
//	                if(flip)
//	                	rotate(10,bitmap1, img1);
//	                else
//	                	rotate(10,bitmap2, img1);
//	                
                	img1.setScaleType(ScaleType.CENTER);
  
	                break;

	            case MotionEvent.ACTION_DOWN:

	            	if(source!=null){
	            		if(flip){
	            			rotate(10,bitmap1, img1);
	            			img1.setScaleType(ScaleType.CENTER);
	            			flip=false;
	            		}else{
		                	rotate(10,bitmap2, img1);
		                	img1.setScaleType(ScaleType.CENTER);
		                	flip=true;
	            		}
	            	}
	                break;

	            case MotionEvent.ACTION_UP:

	            	break;

	            default :
	                break;
	        }
	        return true;
	    }
	};
	
	private OnTouchListener img1TouchListener4 = new OnTouchListener()
	{
	    @Override
	    public boolean onTouch(View v, MotionEvent event)
	    {
	    	System.out.println("sundi img5"  );
	    	img5 = (ImageView) findViewById(R.id.imageview);
		    img5.setOnTouchListener(img1TouchListener4);

		    bitmap1 = BitmapFactory.decodeResource(getResources(), R.drawable.card);
		    bitmap2 = BitmapFactory.decodeResource(getResources(), R.drawable.jackred);
		    Matrix matrix = new Matrix();
		    source = Bitmap.createBitmap(bitmap1, 0, 0, bitmap1.getWidth(), bitmap1.getHeight(), matrix, false);
	        switch (event.getAction())
	        {
	            case MotionEvent.ACTION_MOVE:
	                Log.d("MOVE", "1");
//	                if(flip)
//	                	rotate(10,bitmap1, img1);
//	                else
//	                	rotate(10,bitmap2, img1);
//	                
                	img5.setScaleType(ScaleType.CENTER);
  
	                break;

	            case MotionEvent.ACTION_DOWN:

	            	if(source!=null){
	            		if(flip){
	            	
	            			try{
	            				
	            			rotate(90,bitmap1, img5);
	            			//Thread.sleep(500);
	            			}catch (Exception e) {
								// TODO: handle exception
	            				e.printStackTrace();
							}
	            			rotate(20,bitmap1, img5);
	            			rotate(10,bitmap1, img5);
	            			img5.setScaleType(ScaleType.CENTER);
	            			flip=false;
	            		}else{
	            			try{
	            				
	            				rotate(90,bitmap2, img5);
	            				//Thread.sleep(500);
	            			}catch (Exception e) {
								// TODO: handle exception
							}
	            			
	            			rotate(20,bitmap2, img5);
		                	rotate(10,bitmap2, img5);
		                	img5.setScaleType(ScaleType.CENTER);
		                	flip=true;
	            		}
	            	}
	                break;

	            case MotionEvent.ACTION_UP:

	            	break;

	            default :
	                break;
	        }
	        return true;
	    }
	};

	
	private OnTouchListener img1TouchListener3 = new OnTouchListener()
	{
	    @Override
	    public boolean onTouch(View v, MotionEvent event)
	    {
	    	System.out.println("sundi img4"  );
	    	img4 = (ImageView) findViewById(R.id.imageview);
		    img4.setOnTouchListener(img1TouchListener3);

		    bitmap1 = BitmapFactory.decodeResource(getResources(), R.drawable.card);
		    bitmap2 = BitmapFactory.decodeResource(getResources(), R.drawable.jackred);
		    Matrix matrix = new Matrix();
		    source = Bitmap.createBitmap(bitmap1, 0, 0, bitmap1.getWidth(), bitmap1.getHeight(), matrix, false);
	        switch (event.getAction())
	        {
	            case MotionEvent.ACTION_MOVE:
	                Log.d("MOVE", "1");
//	                if(flip)
//	                	rotate(10,bitmap1, img1);
//	                else
//	                	rotate(10,bitmap2, img1);
//	                
                	img4.setScaleType(ScaleType.CENTER);
  
	                break;

	            case MotionEvent.ACTION_DOWN:

	            	if(source!=null){
	            		if(flip){
	            			rotate(10,bitmap1, img4);
	            			img4.setScaleType(ScaleType.CENTER);
	            			flip=false;
	            		}else{
		                	rotate(10,bitmap2, img4);
		                	img4.setScaleType(ScaleType.CENTER);
		                	flip=true;
	            		}
	            	}
	                break;

	            case MotionEvent.ACTION_UP:

	            	break;

	            default :
	                break;
	        }
	        return true;
	    }
	};

	private OnTouchListener img1TouchListener2 = new OnTouchListener()
	{
	    @Override
	    public boolean onTouch(View v, MotionEvent event)
	    {
	    	System.out.println("sundi img3"  );
	    	img3 = (ImageView) findViewById(R.id.imageview);
		    img3.setOnTouchListener(img1TouchListener2);

		    bitmap1 = BitmapFactory.decodeResource(getResources(), R.drawable.card);
		    bitmap2 = BitmapFactory.decodeResource(getResources(), R.drawable.jackred);
		    Matrix matrix = new Matrix();
		    source = Bitmap.createBitmap(bitmap1, 0, 0, bitmap1.getWidth(), bitmap1.getHeight(), matrix, false);
	        switch (event.getAction())
	        {
	            case MotionEvent.ACTION_MOVE:
	                Log.d("MOVE", "1");
//	                if(flip)
//	                	rotate(10,bitmap1, img1);
//	                else
//	                	rotate(10,bitmap2, img1);
//	                
                	img3.setScaleType(ScaleType.CENTER);
  
	                break;

	            case MotionEvent.ACTION_DOWN:

	            	if(source!=null){
	            		if(flip){
	            			rotate(10,bitmap1, img3);
	            			img3.setScaleType(ScaleType.CENTER);
	            			flip=false;
	            		}else{
		                	rotate(10,bitmap2, img3);
		                	img3.setScaleType(ScaleType.CENTER);
		                	flip=true;
	            		}
	            	}
	                break;

	            case MotionEvent.ACTION_UP:

	            	break;

	            default :
	                break;
	        }
	        return true;
	    }
	};

	private OnTouchListener img1TouchListener1 = new OnTouchListener()
	{
	    @Override
	    public boolean onTouch(View v, MotionEvent event)
	    {
	    	System.out.println("sundi img2"  );
	    	img2 = (ImageView) findViewById(R.id.imageview);
		    img2.setOnTouchListener(img1TouchListener1);

		    bitmap1 = BitmapFactory.decodeResource(getResources(), R.drawable.card);
		    bitmap2 = BitmapFactory.decodeResource(getResources(), R.drawable.jackred);
		    Matrix matrix = new Matrix();
		    source = Bitmap.createBitmap(bitmap1, 0, 0, bitmap1.getWidth(), bitmap1.getHeight(), matrix, false);
	        switch (event.getAction())
	        {
	            case MotionEvent.ACTION_MOVE:
	                Log.d("MOVE", "1");
//	                if(flip)
//	                	rotate(10,bitmap1, img1);
//	                else
//	                	rotate(10,bitmap2, img1);
//	                
                	img2.setScaleType(ScaleType.CENTER);
  
	                break;

	            case MotionEvent.ACTION_DOWN:

	            	if(source!=null){
	            		if(flip){
	            			rotate(10,bitmap1, img2);
	            			img2.setScaleType(ScaleType.CENTER);
	            			flip=false;
	            		}else{
		                	rotate(10,bitmap2, img2);
		                	img2.setScaleType(ScaleType.CENTER);
		                	flip=true;
	            		}
	            	}
	                break;

	            case MotionEvent.ACTION_UP:

	            	break;

	            default :
	                break;
	        }
	        return true;
	    }
	};

	
	private void rotate(double r , Bitmap currentBitmap  ,ImageView imageView )
	{
	    int rotation = (int) Math.toDegrees(r);
	    Matrix matrix = new Matrix();
	    matrix.setRotate(rotation, currentBitmap.getWidth()/2, currentBitmap.getHeight()/2);
	    
	    source = Bitmap.createBitmap(currentBitmap, 0, 0, currentBitmap.getWidth(), currentBitmap.getHeight(), matrix, false);
	    imageView.setImageBitmap(source);
	    Log.i("HIGHT OF CURRENT BITMAP", ""+source.getHeight());
	}

	}