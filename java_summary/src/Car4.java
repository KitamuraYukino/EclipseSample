class Car4{
  private int no;
  private int count = 0;

  public Car4(){
    no = 0;
    count++;
    System.out.println("�i���o�[�Ȃ������܂���");
  }
  public Car4(int n){
    no = n;
    count++;
    System.out.println("�i���o�[" + no + "�����܂���");
  }
  public void display(){
    System.out.println(count + "��쐬�ςł�");
  }
}