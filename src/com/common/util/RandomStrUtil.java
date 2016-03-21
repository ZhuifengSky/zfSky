package com.common.util;

import java.util.Random;

/**
 * 
 * @author Administrator �����־code������
 */
public class RandomStrUtil {

	/**
	 * ���������־
	 * 
	 * @param length
	 * @return
	 */
	public static String getRandomNumber(int length) {
		String str = "0123456789";
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {
			int number = random.nextInt(10);
			sb.append(str.charAt(number));
		}
		return sb.toString();
	}

	/**
	 * java����������ֺ���ĸ���
	 * 
	 * @param length
	 *            [����������ĳ���]
	 * @return
	 */
	public static String getCharAndNumr(int length) {
		String val = "";
		Random random = new Random();
		for (int i = 0; i < length; i++) {
			// �����ĸ��������
			String charOrNum = random.nextInt(2) % 2 == 0 ? "char" : "num";
			// �ַ���
			if ("char".equalsIgnoreCase(charOrNum)) {
				// ȡ�ô�д��ĸ����Сд��ĸ
				int choice = random.nextInt(2) % 2 == 0 ? 65 : 97;
				val += (char) (choice + random.nextInt(26));
			} else if ("num".equalsIgnoreCase(charOrNum)) { // ����
				val += String.valueOf(random.nextInt(10));
			}
		}
		return val;
	}

	/**
	 * �����������
	 * 
	 * @param numLength
	 * @param strNum
	 * @return
	 */
	public static String getTaskCode() {
		String numRandon = getRandomNumber(5);
		String strRandon = getCharAndNumr(27);
		return numRandon + strRandon;
	}

	public static void main(String[] args) {
		System.out.println(getTaskCode());
	}
}
