import java.io.*;
import java.util.*;

public class GameHelper {
	private static final String alphabet = "abcdefg";
	private int gridLength = 7;
	private int gridSize = 49;
	private int[] grid = new int[gridSize];
	private int comCount = 0;

	public String getUserInput(String prompt) {
		String inputLine = null;
		System.out.println(prompt + " ");
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			inputLine = is.readLine();
			if (inputLine.length() == 0) {
				return null;
			}
		} catch (IOException e) {
			System.out.println("IoException: " + e);
		}
		return inputLine.toLowerCase();
	}

	public ArrayList<String> placeDotCom(int comSize) {
		ArrayList<String> alphaCells = new ArrayList<String>();
//		String[] alphacoords = new String[comSize]; // 'f6'�Ȃǂ̃R�[�h��ێ�����
		String temp		= null;				// ��ŘA�����镶������ꎞ�I�ɕێ�
		int[] coords	= new int[comSize];	// ���ƂȂ�Z���ԍ���ێ�����
		int attempts	= 0;				// ���s�񐔂̃J�E���^
		boolean sucess	= false;			// �z�u���K�؂��������t���O
		int location	= 0;				// ���̎��_�łǂ̃Z���������ΏۂɂȂ��Ă��邩������

		comCount++;					// �z�u�Ώۂ�DotCom�I�u�W�F�N�g��ς���
		int incr = 1;				// �I�u�W�F�N�g�̔z�u���������ɂ���
		if ((comCount % 2) == 1) {	// ��Ŗڂ�DotCom�I�u�W�F�N�g�̏ꍇ��
			incr = gridLength;		// �I�u�W�F�N�g�̔z�u���c�����ɂ���
		}

		while (!sucess & attempts++ < 200) {						// ���C���̃��[�v
			location = (int) (Math.random() * gridSize);			// ���������
//			System.out.print(" try " + location);
			int x = 0;												// �����ڂ̃Z�����A�������l
			sucess = true;											// true�͔ԍ��̎w�肪�����������Ƃ�����
			while (sucess && x < comSize) {							// �ׂ���g���Ă��Ȃ��ꏊ��T��
				if (grid[location] == 0) {							// �܂��g���Ă��Ȃ����ǂ����𔻒�
					coords[x++] = location;							// ����ꂽ�z�����ۑ�
					location += incr;								// �����Ώۂ�ׂ̃Z���Ɉڂ�
					if (location >= gridSize) {						// �O���b�h���牺�ɂ͂ݏo�Ă��Ȃ����m�F
						sucess = false;								// ���s
					}
					if (x > 0 && (location % gridLength == 0)) {	// �O���b�h����E�ɂ͂ݏo�Ă��Ȃ����m�F
						sucess = false;								// ���s
					}
				} else {											// ���łɎg���Ă���Z���������ꍇ
//					System.out.print(" used " + location);
					sucess = false;									// ���s
				}
			}
		}

		int x		= 0;	// �ŏI�I�Ȗ߂�l�𓾂�
		int row		= 0;
		int column	= 0;
		while (x < comSize) {
//			System.out.println("\n");
			grid[coords[x]] = 1;							// �Z�����u�g�p�ς݁v�ɂ���
			row = (int) (coords[x] / gridLength);			// �������̔ԍ��𓾂�
			column = coords[x] % gridLength;				// �c�����̔ԍ��𓾂�
			temp = String.valueOf(alphabet.charAt(column));	// �ԍ����A���t�@�x�b�g�ɕϊ�
			alphaCells.add(temp.concat(Integer.toString(row)));
			x++;
			System.out.println(" coord " + x + " = " + alphaCells.get(x - 1));
		}
//		System.out.println("\n");

		return alphaCells;
	}
}