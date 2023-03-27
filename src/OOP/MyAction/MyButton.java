package OOP.MyAction;

public  class MyButton implements IClick{
    private IClick iClick;

    private IDoubleClick iDoubleClick;

    public MyButton(){
        MyButton myButton=new MyButton();
    }
    public MyButton(IClick iClick1)
    {
        this.iClick=iClick1;
    }
    public MyButton(IClick iClick1,IDoubleClick iDoubleClick1)
    {
//        MyButton myButton;
        this.iClick=iClick1;
        this.iDoubleClick=iDoubleClick1;
    }
    @Override
    public void Click()
    {


    }
//    @Override
//    public void doubleClick()
//    {
//
//    }
    public void MyButton(){
        String data="Hello, World!";
        MyButton btn=new MyButton(new IClick() {
            @Override
            public void Click() {
                System.out.println("Click"+data);
            }
        }, new IDoubleClick() {
            @Override
            public void DoubleClick() {
                System.out.println("DoubleClick"+data);
            }
        });
         btn.Click();

    }
}
