/*
ʹ�ñ�����ʱ����һЩע�����

1. ������������������ô����֮������Ʋ������ظ���
2. ����float��long������˵����ĸ��׺F��L��Ҫ������
3. ���ʹ��byte����short���͵ı�������ô�Ҳ������ֵ���ܳ���������͵ķ�Χ��
4. û�н��и�ֵ�ı���������ֱ��ʹ�ã�һ��Ҫ��ֵ֮�󣬲���ʹ�á�
5. ����ʹ�ò��ܳ���������ķ�Χ��
�������򡿣��Ӷ��������һ�п�ʼ��һֱ��ֱ�������Ĵ����Ž���Ϊֹ��
6. ����ͨ��һ������������������������һ��������Ƽ���ôд��
*/
public class Demo03VariableNotice {
	public static void main(String[] args) {
		int num1 = 10; // ������һ���µı���������num1
		// int num1 = 20; // �ִ�������һ���µı���������Ҳ��num1������
		
		int num2 = 20;
		
		int num3;
		num3 = 30;
		
		int num4; // ������һ������������û�н��и�ֵ
		// System.out.println(num4); // ֱ��ʹ�ô�ӡ������Ǵ���ģ�
		
		// System.out.println(num5); // �ڴ�������֮ǰ������ʹ���������
		
		int num5 = 500;
		System.out.println(num5); // 500
		
		{
			int num6 = 60;
			System.out.println(num6); // 60
		}
		// int num6;
		// System.out.println(num6); // �Ѿ������˴����ŵķ�Χ�������������򣬱���������ʹ����
		
		// ͬʱ����������ȫ����int���͵ı���
		int a, b, c;
		// ���Էֱ�ֵ
		a = 10;
		b = 20;
		c = 30;
		System.out.println(a); // 10
		System.out.println(b); // 20
		System.out.println(c); // 30
		
		// ͬʱ��������int����������ͬʱ���Ը�ֵ
		int x = 100, y = 200, z = 300;
		System.out.println(x); // 100
		System.out.println(y); // 200
		System.out.println(z); // 300
	}
}