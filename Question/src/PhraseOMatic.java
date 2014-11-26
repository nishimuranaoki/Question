public class PhraseOMatic {
public static void main (String [] args){    


    
   String [] wordListOne ={"ベストロリィ","ムルミロ","チャリオット"
};

   String [] wordListTwo ={"リンゴ","ゴリラ","ラッパ"
,"パイナップル","ルイージ",
"邪魔","魔女","ようかん"};



   String [] wordListThree ={"ライコウ","ライラ","ジャンクシンクロン"
,"フォーミュラシンクロン","死者蘇生",
"デブリドラゴン","ダンディライオン","グローアップバブル"};



int oneLength = wordListOne.length;
int twoLength = wordListTwo.length;
int threeLength = wordListThree.length;

int rand1 = (int)(Math.random()*oneLength);
int rand2 = (int)(Math.random()*twoLength);
int rand3 = (int)(Math.random()*threeLength);

String phrase = wordListOne [rand1] + " " +
wordListTwo [rand2] +" " +wordListThree [rand3];

System.out.println("what we need is a " +phrase);
}
}