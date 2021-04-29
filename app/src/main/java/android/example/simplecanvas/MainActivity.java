package android.example.simplecanvas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Canvas mCanvas;
    private Paint mPaint = new Paint();
    private Paint mPaintText= new Paint(Paint.UNDERLINE_TEXT_FLAG);
    private Bitmap mBitmap;
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageView=findViewById(R.id.my_imageview);
        mPaint.setColor(Color.YELLOW);
        mPaintText.setColor(ResourcesCompat.getColor(getResources(),R.color.purple_200, null));
        mPaintText.setTextSize(80);
    }

    public void drawSomething(View view) {
        int vWidth=view.getWidth();
        int vHeight=view.getHeight();
        mBitmap=Bitmap.createBitmap(vWidth,vHeight,Bitmap.Config.ARGB_8888);
        mImageView.setImageBitmap(mBitmap);
        mCanvas=new Canvas(mBitmap);
//
//        mCanvas.drawColor(Color.GREEN);
//        mCanvas.drawText(getString(R.string.app_name),100,100,mPaintText);
//
//        mPaint.setColor(Color.BLUE);
//        mPaint.setStrokeWidth(10);
//        mCanvas.drawLine(100, 150, 400, 150, mPaint);
//
//        mPaint.setColor(Color.RED);
//        Rect mRect= new Rect();
//        mRect.set(100,200,600,400);
//        mCanvas.drawRect(mRect,mPaint);
//
//        mPaint.setColor(Color.CYAN);
//        mCanvas.drawCircle(250,500,100,mPaint);
//
//        Path path = new Path();
//        path.moveTo(100,700);
//        path.lineTo(300,800);
//        path.lineTo(500,700);
//        path.lineTo(700,800);
//        mPaint.setColor(Color.MAGENTA);
//        mCanvas.drawPath(path,mPaint);
//
//        mPaint.setColor(Color.GRAY);
//        RectF rectF=new RectF();
//        rectF.set(100,200,600,400);
//        mCanvas.drawOval(rectF,mPaint);

        mCanvas.drawColor(Color.BLUE);

//        Wall
        mPaint.setColor(Color.GRAY);
        Rect mRect = new Rect();
        mRect.set(300,500,800,1100);
        mCanvas.drawRect(mRect,mPaint);

//        Door
        mPaint.setColor(Color.DKGRAY);
        mRect.set(400,750,550,1100);
        mCanvas.drawRect(mRect,mPaint);
        mPaint.setColor(Color.YELLOW);
        mCanvas.drawCircle(500,950,10,mPaint);

//        Window
        mPaint.setColor(Color.YELLOW);
        mRect.set(600,800,700,1000);
        mCanvas.drawRect(mRect,mPaint);
        mPaint.setColor(Color.BLUE);
        mRect.set(610,810,690,990);
        mCanvas.drawRect(mRect,mPaint);

//        Roof
        mPaint.setColor(Color.RED);
        Path path = new Path();
        path.moveTo(300,500);
        path.lineTo(550,300);
        path.lineTo(800,500);
        mCanvas.drawPath(path,mPaint);

//        Name
        mPaintText.setColor(Color.BLACK);
        mCanvas.drawText("Moh Herlambang A", 300,250,mPaintText);

        view.invalidate();

    }
}