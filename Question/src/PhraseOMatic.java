public class PhraseOMatic {
public static void main (String [] args){    


    
   String [] wordListOne ={"�x�X�g�����B","�����~��","�`�����I�b�g"
};

   String [] wordListTwo ={"�����S","�S����","���b�p"
,"�p�C�i�b�v��","���C�[�W",
"�ז�","����","�悤����"};



   String [] wordListThree ={"���C�R�E","���C��","�W�����N�V���N����"
,"�t�H�[�~�����V���N����","���ґh��",
"�f�u���h���S��","�_���f�B���C�I��","�O���[�A�b�v�o�u��"};



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