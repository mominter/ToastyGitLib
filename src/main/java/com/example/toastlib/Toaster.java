package com.example.toastlib;

import android.content.Context;
import android.widget.Toast;

public class Toaster {

    public static void SimpleToast(Context ctx, String strMsg)
    {
        Toast.makeText(ctx,strMsg,Toast.LENGTH_SHORT).show();
    }
}
