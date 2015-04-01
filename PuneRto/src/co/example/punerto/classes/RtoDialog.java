package co.example.punerto.classes;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

import com.androidexample.gcm.R;

public class RtoDialog 
{
	static boolean ret=false;
	
	public static void showNeutralDialog(Context con, String title,String msg)
	{
		
		AlertDialog altdia = new AlertDialog.Builder(con)
        .setTitle(title)
        .setMessage(msg)
        .setNeutralButton(android.R.string.yes, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) { 
                // continue with delete
            }
         })
        
        .setIcon(R.drawable.rtoogo)
         .show();
		
	}
	
	public static boolean showConfirmDialog(Context con, String title,String msg)
	{
		 
		AlertDialog altdia = new AlertDialog.Builder(con)
        .setTitle(title)
        .setMessage(msg)
        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() 
	        {
	            public void onClick(DialogInterface dialog, int which) 
	            { 
	            	
	            	ret=true;
	               
	        }})
        
        .setNegativeButton(android.R.string.yes, new DialogInterface.OnClickListener() 
            {
                public void onClick(DialogInterface dialog, int which)
                { 
                	ret=false;
                   
            }})  
            
        
        
        .setIcon(R.drawable.rtoogo)
        
         .show();
		
		
		return ret;
	}
	
	
	
	public void  showDate()
	{
		
	}

}
