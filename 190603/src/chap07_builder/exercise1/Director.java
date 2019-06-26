package chap07_builder.exercise1;

public class Director {
	
	private Builder builder;
	public Director(Builder builder)	{
		this.builder = builder;
		
	}
	
	public void construct()	{				// ���� ����
		builder.makeTitle("Greeting");		// Ÿ��Ʋ
		builder.makeString("��ħ�� ����");		// ���ڿ�
		builder.makeItems(new String[] {	// ���� �׸�
				"���� ��ħ�Դϴ�.",
				"�ȳ��ϼ���."				
		});
		
		builder.makeString("�㿡");			// ������ ���ڿ�
		builder.makeItems(new String[] {	// ������ ���� �׸�
				"�ȳ��ϼ���.",
				"�ȳ��� �ֹ�����.",
				"�ȳ��� �輼��."				
		});
		
		builder.close();	// ������ �ϼ���Ų��.
	}
	
	

}
