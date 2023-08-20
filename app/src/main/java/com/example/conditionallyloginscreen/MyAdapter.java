package com.example.conditionallyloginscreen;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;


public class MyAdapter extends ArrayAdapter<Model> {
    Context mctx;
    ArrayList<Model> arrayList;
    int total = 5;
    int potal = 10;

    int c;
    int sum = 1;
    int f;
    int k;
    Handler handler = new Handler();


    public MyAdapter(@NonNull Context mctx, ArrayList<Model> arrayList) {
        super(mctx, R.layout.rowview, arrayList);
        this.mctx = mctx;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        LayoutInflater inflater = LayoutInflater.from(mctx);
        View listviewitem = inflater.inflate(R.layout.rowview, parent, false);

        TextView tx1 = listviewitem.findViewById(R.id.tx1);
        TextView tx2 = listviewitem.findViewById(R.id.tx2);
        TextView rs = listviewitem.findViewById(R.id.rs);
        TextView rs1 = listviewitem.findViewById(R.id.rs1);
        TextView cen = listviewitem.findViewById(R.id.cen);
        ImageView img = listviewitem.findViewById(R.id.img);
        TextView orderplaced = listviewitem.findViewById(R.id.orderplaced);

        Button delbtn = listviewitem.findViewById(R.id.delbtn);
        delbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // ((Activity)mctx).finish();
                cen.setText("" + 0);
                rs1.setText("" + 0);

                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ((Activity) mctx).finish();


                    }
                }, 1000);
            }
        });


        Button plus = listviewitem.findViewById(R.id.plus);
        Button minus = listviewitem.findViewById(R.id.minus);

        Model model = arrayList.get(position);
        tx1.setText(model.getP());
        tx2.setText(model.getQ());
        Picasso.with(mctx).load(model.getImage()).into(img);
        rs1.setText(model.getLate());


        cen.setText("" + 1);

        String d = String.valueOf(cen.getText());
        k = Integer.parseInt(d);
        cen.setText("" + k);


        c = Integer.parseInt(model.getLate());
        rs1.setText("" + c);


        if (c == 5) {
            plus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    sum = sum + 1;
                    cen.setText("" + sum);
                    f = c + 5;
                    rs1.setText("" + f);
                    c = f;
                }
            });

        } else if (c == 10) {
            plus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    sum = sum + 1;
                    cen.setText("" + sum);
                    f = c + 10;
                    rs1.setText("" + f);
                    c = f;
                }
            });

        } else if (c == 15) {
            plus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    sum = sum + 1;
                    cen.setText("" + sum);
                    f = c + 15;
                    rs1.setText("" + f);
                    c = f;

                }
            });

        } else if (c == 20) {
            plus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    sum = sum + 1;
                    cen.setText("" + sum);
                    f = c + 20;
                    rs1.setText("" + f);
                    c = f;

                }
            });

        }


        if (k > 0 && c == 5) {
            minus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    sum = sum - 1;
                    cen.setText("" + sum);
                    f = c - 5;
                    rs1.setText("" + f);
                    c = f;

                    if (sum < 0 && f < 0) {
                        sum = 0;
                        f = 0;
                        cen.setText("" + sum);
                        rs1.setText("" + f);


                    }


                }
            });

        } else if (k > 0 && c == 10) {
            minus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    sum = sum - 1;
                    cen.setText("" + sum);
                    f = c - 10;
                    rs1.setText("" + f);
                    c = f;


                    if (sum < 0 && f < 0) {
                        sum = 0;
                        f = 0;
                        cen.setText("" + sum);
                        rs1.setText("" + f);


                    }
                }
            });

        } else if (k > 0 && c == 15) {
            minus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    sum = sum - 1;
                    cen.setText("" + sum);
                    f = c - 15;
                    rs1.setText("" + f);
                    c = f;


                    if (sum < 0 && f < 0) {
                        sum = 0;
                        f = 0;
                        cen.setText("" + sum);
                        rs1.setText("" + f);


                    }
                }
            });

        } else if (k > 0 && c == 20) {
            minus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    sum = sum - 1;
                    cen.setText("" + sum);
                    f = c - 20;
                    rs1.setText("" + f);
                    c = f;


                    if (sum < 0 && f < 0) {
                        sum = 0;
                        f = 0;
                        cen.setText("" + sum);
                        rs1.setText("" + f);


                    }
                }
            });

        }
        orderplaced.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("MissingPermission")
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    NotificationChannel nc = new NotificationChannel("01", "XYZ", NotificationManager.IMPORTANCE_DEFAULT);
                    NotificationManager nm = (NotificationManager)mctx.getSystemService(NotificationManager.class);
                    nm.createNotificationChannel(nc);
                }
                NotificationCompat.Builder ncb = new NotificationCompat.Builder(mctx, "01");
                ncb.setSmallIcon(R.drawable.notifications_active_24);
                ncb.setContentTitle("Your Order Has Been Placed");
                ncb.setContentText("Your's Total Amount is:"+c +'\n'+"Your Item Quantity is:"+sum);
                NotificationManagerCompat nmc=NotificationManagerCompat.from(mctx);
                nmc.notify(1, ncb.build());

                Intent intent=new Intent(mctx, Successful.class);
                mctx.startActivity(intent);

            }

        });


        return listviewitem;

    }


}
