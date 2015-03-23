package com.example.punerto.Activity;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Transport;

import android.os.AsyncTask;
import android.util.Log;

public class SendMailTask extends AsyncTask<Message, Void, Void>  {

//	public void execute(Message message) {
//		// TODO Auto-generated method stub
//		
//	}

	@Override
	protected Void doInBackground(Message... messages) {
		// TODO Auto-generated method stub
		Log.e("test", "in doInBackground");
        try {
            Transport.send(messages[0]);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        return null;
	}

}
