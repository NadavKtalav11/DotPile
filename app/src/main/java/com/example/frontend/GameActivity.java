package com.example.frontend;

import static android.content.ContentValues.TAG;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.bluetooth.BluetoothA2dp;
import android.content.ClipData;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mygame.Board;
import com.example.mygame.Card;
import com.example.mygame.Game;
import com.example.mygame.Pile;
import com.example.mygame.R;


public class GameActivity extends Activity {
    //public String string = "start new game";

    Board gameBoard;
    ImageView imageView10;
    ImageView imageView11;
    ImageView imageView12;

    ImageView[][] dots1CardArray ;
    ImageView[][] dots2CardArray ;
    ImageView[][] dots3CardArray ;
    ImageView[][] dots4CardArray ;
    ImageView[][] dots5CardArray ;
    ImageView[][] dots6CardArray ;
    ImageView[][] dots7CardArray ;
    ImageView[][] dots8CardArray ;
    ImageView[][] dots9CardArray ;


    ImageView imageView1;
    ImageView imageView101;
    ImageView imageView102;
    ImageView imageView103;
    ImageView imageView104;
    ImageView imageView105;
    ImageView imageView106;
    ImageView imageView107;
    ImageView imageView108;
    ImageView imageView109;

    ImageView imageView2;
    ImageView imageView201;
    ImageView imageView202;
    ImageView imageView203;
    ImageView imageView204;
    ImageView imageView205;
    ImageView imageView206;
    ImageView imageView207;
    ImageView imageView208;
    ImageView imageView209;

    ImageView imageView3;
    ImageView imageView301;
    ImageView imageView302;
    ImageView imageView303;
    ImageView imageView304;
    ImageView imageView305;
    ImageView imageView306;
    ImageView imageView307;
    ImageView imageView308;
    ImageView imageView309;

    ImageView imageView4;
    ImageView imageView401;
    ImageView imageView402;
    ImageView imageView403;
    ImageView imageView404;
    ImageView imageView405;
    ImageView imageView406;
    ImageView imageView407;
    ImageView imageView408;
    ImageView imageView409;

    ImageView imageView5;
    ImageView imageView501;
    ImageView imageView502;
    ImageView imageView503;
    ImageView imageView504;
    ImageView imageView505;
    ImageView imageView506;
    ImageView imageView507;
    ImageView imageView508;
    ImageView imageView509;

    ImageView imageView6;
    ImageView imageView601;
    ImageView imageView602;
    ImageView imageView603;
    ImageView imageView604;
    ImageView imageView605;
    ImageView imageView606;
    ImageView imageView607;
    ImageView imageView608;
    ImageView imageView609;

    ImageView imageView7;
    ImageView imageView701;
    ImageView imageView702;
    ImageView imageView703;
    ImageView imageView704;
    ImageView imageView705;
    ImageView imageView706;
    ImageView imageView707;
    ImageView imageView708;
    ImageView imageView709;

    ImageView imageView8;
    ImageView imageView801;
    ImageView imageView802;
    ImageView imageView803;
    ImageView imageView804;
    ImageView imageView805;
    ImageView imageView806;
    ImageView imageView807;
    ImageView imageView808;
    ImageView imageView809;

    ImageView imageView9;
    ImageView imageView901;
    ImageView imageView902;
    ImageView imageView903;
    ImageView imageView904;
    ImageView imageView905;
    ImageView imageView906;
    ImageView imageView907;
    ImageView imageView908;
    ImageView imageView909;

    ImageView[][] dots10CardArray ;
    ImageView imageView1001;
    ImageView imageView1002;
    ImageView imageView1003;
    ImageView imageView1004;
    ImageView imageView1005;
    ImageView imageView1006;
    ImageView imageView1007;
    ImageView imageView1008;
    ImageView imageView1009;


    ImageView[][] dots11CardArray ;
    ImageView imageView1101;
    ImageView imageView1102;
    ImageView imageView1103;
    ImageView imageView1104;
    ImageView imageView1105;
    ImageView imageView1106;
    ImageView imageView1107;
    ImageView imageView1108;
    ImageView imageView1109;


    ImageView[][] dots12CardArray ;
    ImageView imageView1201;
    ImageView imageView1202;
    ImageView imageView1203;
    ImageView imageView1204;
    ImageView imageView1205;
    ImageView imageView1206;
    ImageView imageView1207;
    ImageView imageView1208;
    ImageView imageView1209;

    ImageView[][] mainCards ;
    ImageView[][][][] mainCardsDots;
    ImageView[] cardsOptions;

    int[] ids;


    @SuppressLint("ClickableViewAccessibility")
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.game_layout);


        imageView10 = (ImageView) findViewById(R.id.imageView10);
        imageView11 = (ImageView) findViewById(R.id.imageView11);
        imageView12 = (ImageView) findViewById(R.id.imageView12);

        imageView1 = (ImageView) findViewById(R.id.imageView1);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView3 = (ImageView) findViewById(R.id.imageView3);
        imageView4 = (ImageView) findViewById(R.id.imageView4);
        imageView5 = (ImageView) findViewById(R.id.imageView5);
        imageView6 = (ImageView) findViewById(R.id.imageView6);
        imageView7 = (ImageView) findViewById(R.id.imageView7);
        imageView8 = (ImageView) findViewById(R.id.imageView8);
        imageView9 = (ImageView) findViewById(R.id.imageView9);





        imageView101 = (ImageView) findViewById(R.id.imageView101);
        imageView102 = (ImageView) findViewById(R.id.imageView102);
        imageView103 = (ImageView) findViewById(R.id.imageView103);
        imageView104 = (ImageView) findViewById(R.id.imageView104);
        imageView105 = (ImageView) findViewById(R.id.imageView105);
        imageView106 = (ImageView) findViewById(R.id.imageView106);
        imageView107 = (ImageView) findViewById(R.id.imageView107);
        imageView108 = (ImageView) findViewById(R.id.imageView108);
        imageView109 = (ImageView) findViewById(R.id.imageView109);
        dots1CardArray =  new ImageView[][]{{imageView101 ,imageView102, imageView103},
                {imageView104 ,imageView105, imageView106},
                {imageView107 ,imageView108, imageView109}};


        imageView201 = (ImageView) findViewById(R.id.imageView201);
        imageView202 = (ImageView) findViewById(R.id.imageView202);
        imageView203 = (ImageView) findViewById(R.id.imageView203);
        imageView204 = (ImageView) findViewById(R.id.imageView204);
        imageView205 = (ImageView) findViewById(R.id.imageView205);
        imageView206 = (ImageView) findViewById(R.id.imageView206);
        imageView207 = (ImageView) findViewById(R.id.imageView207);
        imageView208 = (ImageView) findViewById(R.id.imageView208);
        imageView209 = (ImageView) findViewById(R.id.imageView209);
        dots2CardArray =  new ImageView[][]{{imageView201 ,imageView202, imageView203},
                {imageView204 ,imageView205, imageView206},
                {imageView207 ,imageView208, imageView209}};


        imageView301 = (ImageView) findViewById(R.id.imageView301);
        imageView302 = (ImageView) findViewById(R.id.imageView302);
        imageView303 = (ImageView) findViewById(R.id.imageView303);
        imageView304 = (ImageView) findViewById(R.id.imageView304);
        imageView305 = (ImageView) findViewById(R.id.imageView305);
        imageView306 = (ImageView) findViewById(R.id.imageView306);
        imageView307 = (ImageView) findViewById(R.id.imageView307);
        imageView308 = (ImageView) findViewById(R.id.imageView308);
        imageView309 = (ImageView) findViewById(R.id.imageView309);
        dots3CardArray =  new ImageView[][]{{imageView301 ,imageView302, imageView303},
                {imageView304 ,imageView305, imageView306},
                {imageView307 ,imageView308, imageView309}};

        imageView401 = (ImageView) findViewById(R.id.imageView401);
        imageView402 = (ImageView) findViewById(R.id.imageView402);
        imageView403 = (ImageView) findViewById(R.id.imageView403);
        imageView404 = (ImageView) findViewById(R.id.imageView404);
        imageView405 = (ImageView) findViewById(R.id.imageView405);
        imageView406 = (ImageView) findViewById(R.id.imageView406);
        imageView407 = (ImageView) findViewById(R.id.imageView407);
        imageView408 = (ImageView) findViewById(R.id.imageView408);
        imageView409 = (ImageView) findViewById(R.id.imageView409);
        dots4CardArray =  new ImageView[][]{{imageView401 ,imageView402, imageView403},
                {imageView404 ,imageView405, imageView406},
                {imageView407 ,imageView408, imageView409}};

        imageView501 = (ImageView) findViewById(R.id.imageView501);
        imageView502 = (ImageView) findViewById(R.id.imageView502);
        imageView503 = (ImageView) findViewById(R.id.imageView503);
        imageView504 = (ImageView) findViewById(R.id.imageView504);
        imageView505 = (ImageView) findViewById(R.id.imageView505);
        imageView506 = (ImageView) findViewById(R.id.imageView506);
        imageView507 = (ImageView) findViewById(R.id.imageView507);
        imageView508 = (ImageView) findViewById(R.id.imageView508);
        imageView509 = (ImageView) findViewById(R.id.imageView509);
        dots5CardArray =  new ImageView[][]{{imageView501 ,imageView502, imageView503},
                {imageView504 ,imageView505, imageView506},
                {imageView507 ,imageView508, imageView509}};


        imageView601 = (ImageView) findViewById(R.id.imageView601);
        imageView602 = (ImageView) findViewById(R.id.imageView602);
        imageView603 = (ImageView) findViewById(R.id.imageView603);
        imageView604 = (ImageView) findViewById(R.id.imageView604);
        imageView605 = (ImageView) findViewById(R.id.imageView605);
        imageView606 = (ImageView) findViewById(R.id.imageView606);
        imageView607 = (ImageView) findViewById(R.id.imageView607);
        imageView608 = (ImageView) findViewById(R.id.imageView608);
        imageView609 = (ImageView) findViewById(R.id.imageView609);
        dots6CardArray =  new ImageView[][]{{imageView601 ,imageView602, imageView603},
                {imageView604 ,imageView605, imageView606},
                {imageView607 ,imageView608, imageView609}};


        imageView701 = (ImageView) findViewById(R.id.imageView701);
        imageView702 = (ImageView) findViewById(R.id.imageView702);
        imageView703 = (ImageView) findViewById(R.id.imageView703);
        imageView704 = (ImageView) findViewById(R.id.imageView704);
        imageView705 = (ImageView) findViewById(R.id.imageView705);
        imageView706 = (ImageView) findViewById(R.id.imageView706);
        imageView707 = (ImageView) findViewById(R.id.imageView707);
        imageView708 = (ImageView) findViewById(R.id.imageView708);
        imageView709 = (ImageView) findViewById(R.id.imageView709);
        dots7CardArray =  new ImageView[][]{{imageView701 ,imageView702, imageView703},
                {imageView704 ,imageView705, imageView706},
                {imageView707 ,imageView708, imageView709}};


        imageView801 = (ImageView) findViewById(R.id.imageView801);
        imageView802 = (ImageView) findViewById(R.id.imageView802);
        imageView803 = (ImageView) findViewById(R.id.imageView803);
        imageView804 = (ImageView) findViewById(R.id.imageView804);
        imageView805 = (ImageView) findViewById(R.id.imageView805);
        imageView806 = (ImageView) findViewById(R.id.imageView806);
        imageView807 = (ImageView) findViewById(R.id.imageView807);
        imageView808 = (ImageView) findViewById(R.id.imageView808);
        imageView809 = (ImageView) findViewById(R.id.imageView809);
        dots8CardArray =  new ImageView[][]{{imageView801 ,imageView802, imageView803},
                {imageView804 ,imageView805, imageView806},
                {imageView807 ,imageView808, imageView809}};

        imageView901 = (ImageView) findViewById(R.id.imageView901);
        imageView902 = (ImageView) findViewById(R.id.imageView902);
        imageView903 = (ImageView) findViewById(R.id.imageView903);
        imageView904 = (ImageView) findViewById(R.id.imageView904);
        imageView905 = (ImageView) findViewById(R.id.imageView905);
        imageView906 = (ImageView) findViewById(R.id.imageView906);
        imageView907 = (ImageView) findViewById(R.id.imageView907);
        imageView908 = (ImageView) findViewById(R.id.imageView908);
        imageView909 = (ImageView) findViewById(R.id.imageView909);
        dots9CardArray =  new ImageView[][]{{imageView901 ,imageView902, imageView903},
                {imageView904 ,imageView905, imageView906},
                {imageView907 ,imageView908, imageView909}};



        imageView1001 = (ImageView) findViewById(R.id.imageView1001);
        imageView1002 = (ImageView) findViewById(R.id.imageView1002);
        imageView1003 = (ImageView) findViewById(R.id.imageView1003);
        imageView1004 = (ImageView) findViewById(R.id.imageView1004);
        imageView1005 = (ImageView) findViewById(R.id.imageView1005);
        imageView1006 = (ImageView) findViewById(R.id.imageView1006);
        imageView1007 = (ImageView) findViewById(R.id.imageView1007);
        imageView1008 = (ImageView) findViewById(R.id.imageView1008);
        imageView1009 = (ImageView) findViewById(R.id.imageView1009);
        dots10CardArray =  new ImageView[][]{{imageView1001 ,imageView1002, imageView1003},
                {imageView1004 ,imageView1005, imageView1006},
                {imageView1007 ,imageView1008, imageView1009}};

        imageView1101 = (ImageView) findViewById(R.id.imageView1101);
        imageView1102 = (ImageView) findViewById(R.id.imageView1102);
        imageView1103 = (ImageView) findViewById(R.id.imageView1103);
        imageView1104 = (ImageView) findViewById(R.id.imageView1104);
        imageView1105 = (ImageView) findViewById(R.id.imageView1105);
        imageView1106 = (ImageView) findViewById(R.id.imageView1106);
        imageView1107 = (ImageView) findViewById(R.id.imageView1107);
        imageView1108 = (ImageView) findViewById(R.id.imageView1108);
        imageView1109 = (ImageView) findViewById(R.id.imageView1109);
        dots11CardArray =  new ImageView[][]{{imageView1101 ,imageView1102, imageView1103},
                {imageView1104 ,imageView1105, imageView1106},
                {imageView1107 ,imageView1108, imageView1109}};

        imageView1201 = (ImageView) findViewById(R.id.imageView1201);
        imageView1202 = (ImageView) findViewById(R.id.imageView1202);
        imageView1203 = (ImageView) findViewById(R.id.imageView1203);
        imageView1204 = (ImageView) findViewById(R.id.imageView1204);
        imageView1205 = (ImageView) findViewById(R.id.imageView1205);
        imageView1206 = (ImageView) findViewById(R.id.imageView1206);
        imageView1207 = (ImageView) findViewById(R.id.imageView1207);
        imageView1208 = (ImageView) findViewById(R.id.imageView1208);
        imageView1209 = (ImageView) findViewById(R.id.imageView1209);

        dots12CardArray =  new ImageView[][]{{imageView1201 ,imageView1202, imageView1203},
                {imageView1204 ,imageView1205, imageView1206},
                {imageView1207 ,imageView1208, imageView1209}};



        mainCards = new ImageView[][]{{imageView1, imageView2, imageView3},
                {imageView4, imageView5, imageView6},
                {imageView7, imageView8, imageView9}};


        mainCardsDots = new ImageView[][][][]{{dots1CardArray, dots2CardArray, dots3CardArray},
                {dots4CardArray, dots5CardArray, dots6CardArray},
                {dots7CardArray, dots8CardArray, dots9CardArray}};


        ids =new int[9];
        ids[0] =R.id.imageView1;
        ids[1] =R.id.imageView2;
        ids[2] =R.id.imageView3;
        ids[3] =R.id.imageView4;
        ids[4] =R.id.imageView5;
        ids[5] =R.id.imageView6;
        ids[6] =R.id.imageView7;
        ids[7] =R.id.imageView8;
        ids[8] =R.id.imageView9;

        cardsOptions= new ImageView[]{imageView10, imageView11, imageView12};





        imageView1.setOnDragListener(onDragListener);

        imageView2.setOnDragListener(onDragListener);
        imageView3.setOnDragListener(onDragListener);
        imageView4.setOnDragListener(onDragListener);
        imageView5.setOnDragListener(onDragListener);
        imageView6.setOnDragListener(onDragListener);
        imageView7.setOnDragListener(onDragListener);
        imageView8.setOnDragListener(onDragListener);
        imageView9.setOnDragListener(onDragListener);
        imageView10.setOnTouchListener(onTouchListener);
        imageView11.setOnTouchListener(onTouchListener);
        imageView12.setOnTouchListener(onTouchListener);
        imageView10.setOnDragListener(onDragListener);
        imageView11.setOnDragListener(onDragListener);
        imageView12.setOnDragListener(onDragListener);
        /// initiate the game and the 3 Cards
        gameBoard = new Board();
        Card[] cards= gameBoard.getCardsToPut();
        setCardUI(cards);



    }

    View.OnTouchListener onTouchListener = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View view, MotionEvent event) {
            view.performClick();
            final ClipData clipData = ClipData.newPlainText("card1", "card2");
            view.startDragAndDrop(clipData, new View.DragShadowBuilder(view), view, 0);
            imageView1202.startDragAndDrop(clipData, new View.DragShadowBuilder(imageView1202),imageView1202 , 0);

            if (view.getId()==R.id.imageView12){
                imageView12.startDragAndDrop(clipData, new View.DragShadowBuilder(imageView1202),imageView1202 , 0);
                imageView12.startDragAndDrop(clipData, new View.DragShadowBuilder(imageView1203),imageView1203 , 0);
                imageView12.startDragAndDrop(clipData, new View.DragShadowBuilder(imageView1004),imageView1004 , 0);
                imageView12.startDragAndDrop(clipData, new View.DragShadowBuilder(imageView1005),imageView1205 , 0);
            }
            return true;
        }

    };


    View.OnDragListener onDragListener = new View.OnDragListener() {
        @Override
        public boolean onDrag(View view, DragEvent dragEvent) {
            int dragEvent1 = dragEvent.getAction();
            final View view1 = (View) dragEvent.getLocalState();

            switch (dragEvent1) {

                case (0):
                case (1):
                case (2):
                case (5):
                case (4):
                case (6):
                    return true;
                case DragEvent.ACTION_DROP:
                    //View view2 = (View) dragEvent.getLocalState();
                    ImageView dropTarget = (ImageView) view;
                    //view being dragged and dropped
                    ImageView dropped = (ImageView) view1;
                    int cardNum = 0;
                    int droppedId = dropped.getId();
                    if (droppedId== R.id.imageView10){
                        cardNum =0;
                    }
                    if (droppedId== R.id.imageView11){
                        cardNum =1;
                    }
                    if (droppedId== R.id.imageView12){
                        cardNum =2;
                    }
                    for (int i=0 ; i<3 ;i++) {
                        for (int j = 0; j < 3; j++) {
                            ImageView curr =mainCards[i][j];
                            int index = 3*i+j;
                            int currId = ids[index];
                            if (dropTarget.getId() == currId) {
                                //Pile currPile = gameBoard.getPile(index);
                                if (gameBoard.addCardToPile(index, cardNum)){
                                    for (int k=0 ; k<3 ;k++){
                                        for (int l=0 ; l<3 ;l++){
                                            if(gameBoard.getPile(index).getDotsPile()[k][l]){
                                                mainCardsDots[i][j][k][l].setVisibility(View.VISIBLE);
                                            }
                                            else{
                                                mainCardsDots[i][j][k][l].setVisibility(View.INVISIBLE);
                                            }

                                        }
                                    }
                                    dropped.setVisibility(View.INVISIBLE);
                                    switch (cardNum) {
                                        case 0:
                                        for (int a = 0; a < 9; a++) {
                                            dots10CardArray[a/3][a%3].setVisibility(View.INVISIBLE);

                                        }
                                            break;
                                        case 1:
                                            for (int a = 0; a < 9; a++) {
                                                dots11CardArray[a/3][a%3].setVisibility(View.INVISIBLE);

                                            }
                                            break;
                                        case 2:
                                            for (int a = 0; a < 9; a++) {
                                                dots12CardArray[a/3][a%3].setVisibility(View.INVISIBLE);

                                            }
                                            break;

                                    }
                                    if (!gameBoard.hasOptionToPut()){
                                        imageView10.setVisibility(View.INVISIBLE);
                                        imageView11.setVisibility(View.INVISIBLE);
                                        imageView12.setVisibility(View.INVISIBLE);
                                    }
                                    if (gameBoard.NotNullCards()){
                                        setCardUI(gameBoard.getCardsToPut());
                                    }
                                    /*imageView10.setOnTouchListener(null);
                                    imageView11.setOnTouchListener(null);
                                    imageView12.setOnTouchListener(null);
                                    imageView1.setOnTouchListener(onTouchListener2);
                                    imageView2.setOnTouchListener(onTouchListener2);
                                    imageView3.setOnTouchListener(onTouchListener2);
                                    imageView4.setOnTouchListener(onTouchListener2);
                                    imageView5.setOnTouchListener(onTouchListener2);
                                    imageView6.setOnTouchListener(onTouchListener2);
                                    imageView7.setOnTouchListener(onTouchListener2);
                                    imageView8.setOnTouchListener(onTouchListener2);
                                    imageView8.setOnTouchListener(onTouchListener2);
                                    imageView9.setOnTouchListener(onTouchListener2);*/

                                    break;
                                }
                            }
                        }
                    }
                    return true;
            }
            return true;

        }
    };


   /* View.OnTouchListener onTouchListener2 = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View view, MotionEvent event) {
            view.performClick();
            final ClipData clipData = ClipData.newPlainText("card1", "card2");
            //view.startDragAndDrop(clipData, new View.DragShadowBuilder(view), view, 0);
            //imageView1202.startDragAndDrop(clipData, new View.DragShadowBuilder(imageView1202),imageView1202 , 0);
            if (view.getId()==R.id.imageView10){
                gameBoard.rotate(0);
            }
            if (view.getId()==R.id.imageView10){
                gameBoard.rotate(1);
            }
            if (view.getId()==R.id.imageView10){
                gameBoard.rotate(2);
            }
            return true;
        }

    };*/

    private void setCardUI(Card[] cards){
        boolean[][] dots =cards[0].getDots();
        for (int j=0 ; j<3 ; j++){
            for (int k=0 ; k<dots[j].length ; k++){
                if (dots[j][k]){
                    dots10CardArray[j][k].setVisibility(View.VISIBLE);
                }
            }
        }
        dots =cards[1].getDots();
        for (int j=0 ; j<dots.length ; j++){
            for (int k=0 ; k<dots[j].length ; k++){
                if (dots[j][k]){
                    dots11CardArray[j][k].setVisibility(View.VISIBLE);
                }
            }
        }
        dots =cards[2].getDots();
        for (int j=0 ; j<dots.length ; j++){
            for (int k=0 ; k<dots[j].length ; k++){
                if (dots[j][k]){
                    dots12CardArray[j][k].setVisibility(View.VISIBLE);
                }
            }
        }
        imageView10.setVisibility(View.VISIBLE);
        imageView11.setVisibility(View.VISIBLE);
        imageView12.setVisibility(View.VISIBLE);

    }


    /*View.OnTouchListener onTouchListener = new View.OnTouchListener() {
        @Override
        public boolean OnTouch(View view , MotionEvent motionEvent) {
            ClipData clipData = ClipData.newPlainText("aa","aa");
            View.DragShadowBuilder myShadowBuilder = new View.DragShadowBuilder(view);
            view.startDragAndDrop(clipData, myShadowBuilder,view ,0);
            return true;
        }
    };*/

    public void startNewGame(View view) {
        Game game = new Game();

    }
}


