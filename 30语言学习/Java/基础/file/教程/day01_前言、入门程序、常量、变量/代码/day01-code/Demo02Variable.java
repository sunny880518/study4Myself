/*
���������������ڼ䣬���ݿ��Է����ı������

����һ����������ʹ�õĸ�ʽ��

�������� ��������; // ������һ������
�������� = ����ֵ; // ��ֵ�����ұߵ�����ֵ����ֵ������ߵı���

һ����λ�ĸ�ʽ��

�������� �������� = ����ֵ; // �ڴ���һ��������ͬʱ�����̷���ָ��������ֵ
*/
public class Demo02Variable {
	public static void main(String[] args) {
		// ����һ������
		// ��ʽ���������� ��������;
		int num1;
		// ��������д���һ������
		// ��ʽ���������� = ����ֵ;
		num1 = 10;
		// ����ӡ����������Ƶ�ʱ����ʾ�������Ǳ���������
		System.out.println(num1); // 10
		
		// �ı�������б��������֣�����µ�����
		num1 = 20;
		System.out.println(num1); // 20
		
		// ʹ��һ����λ�ĸ�ʽ���������
		// ��ʽ���������� �������� = ����ֵ;
		int num2 = 25;
		System.out.println(num2); // 25
		
		num2 = 35;
		System.out.println(num2); // 35
		System.out.println("===============");
		
		byte num3 = 30; // ע�⣺�Ҳ���ֵ�ķ�Χ���ܳ�������������͵�ȡֵ��Χ
		System.out.println(num3); // 30
		
		// byte num4 = 400; // �Ҳ೬����byte���ݷ�Χ������
		
		short num5 = 50;
		System.out.println(num5); // 50
		
		long num6 = 3000000000L;
		System.out.println(num6); // 3000000000
		
		float num7 = 2.5F;
		System.out.println(num7); // 2.5
		
		double num8 = 1.2;
		System.out.println(num8); // 1.2
		
		char zifu1 = 'A';
		System.out.println(zifu1); // A
		
		zifu1 = '��';
		System.out.println(zifu1); // ��
		
		boolean var1 = true;
		System.out.println(var1); // true
		
		var1 = false;
		System.out.println(var1); // false
		
		// ��һ���������������ݣ���ֵ������һ������
		// �Ҳ�ı�������var1�Ѿ����ڣ�����װ����false����ֵ
		// ���Ҳ���������falseֵ�����󽻸�var2�������д洢
		boolean var2 = var1;
		System.out.println(var2); // false
	}
}