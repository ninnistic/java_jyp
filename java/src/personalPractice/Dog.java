package personalPractice;
//고안된 클래스를 쓰기 위해서는 역시나 객체가 필요하다. 하긴 그 객체가 있어야 클래스를 써먹던 말던 하지

//1개의 같은 클래스로 여러개의 인스턴스(객체)를 만들 수 있다. 
public class Dog // Dog 이란 클래스를 만들었다.그럼 뭐가 필요하지? 필드! 즉 멤버변수를 만들어야지!! 
{
    // Instance Variables // 그래서 인스턴스 변수를 선언했어. 이 필드는, 인스턴스 변수가 생성되는 곳이야. 그리고 객체의 데이터가 저장되는 곳!! 
    String name;
    String breed;
    int age;
    String color; // 이 필드에서는 초기화를 해주지 않더라도 알아서 기본값으로 초기화가 돼. 이를태면 null이라던지, 이라던지.
    //물론 필드에서 초기화를 해줄 수도 있지, 그렇지만 그렇게되면 다른 클래스에서 객체를 생성할때 이값을 기본값으로 먹게 될거야..그럼 끔찍하지.
 
    // Constructor Declaration of Class // 그다음 이 생성자를 호출할거야. 만약에 너가 호출하지 않더라도 기본 생성자는 생성이 되지만, 나는 생성자에서 클래스 변수들을
    // 초기화 해주고 싶어. 왜냐하면 다른 클래스에서 객체를 생성할 시점에 이 값들은 모두 객체 생성 시점에 다양한 값을 가져야 하거든! 생성자가 실행되지 않으면
    // 클래스로부터 객체를 만들 수가 없어.. 즉 다른 곳에서 써먹지 못한다는 뜻이야. 그리고 이렇게 명시적으로 생성자를 선언한 이상, 너는 Dog tuffy = new Dog();
    //을 할 수가 없어...왜냐면 컴파일러는 기본 생성자를 추가하지 않거든. 명시적으로 했으니 더이상 기본 생성자는 만들어질 수 없지?
    //명시적 생성자가 선언되는 이유는 객체를 다양하게 초기화 하기 위해서야!!
    // 이 생성자 안에 들어가있는 매개변수는... new연산자로 생성자를 호출할때, 너가 입력한 값을 생성작 블록 내부로 전달하기 위해서야!!
    // 그리고!!! 객체 생성시점에..너가 여러 값을 넣고싶고, 다양한 값들로 초기화가 되어야 할 수도 있잖아? 뭐 빨강이라던지 파랑이라던지...그 경우를 위해서
    // 우리는 생성자에서 초기화를 해주는거야. 그래서 생성자에서 매개값을 받아 초기화를 해주는거지. 매개변수는 말 그대로 매개! 외부에서 값을 받아
    // 다양한 값으로 초기화를 해줄테니까...
    // 그래서 예를들어 이 클래스로 우리는 shaggy랑 ixy라는 객체를 만들었어 근데, 이름도 종도 나이도 색도 다 다르잖아? 그럼 매개변수에서
    // 값을 받아서 초기화를 해주는게 더 간단하겠지??그래서 바뀌어야 하는 부분들을 우리가 생성자에서 매개변수로 지정해주는거야!!
    // 근데 관례적으로 필드와 동일한 이름을 갖는 매개변수를 지정해줘야해...근데 그러면 생성자 내부에서 필드에 접근을 못해
    // 매개변수가 사용 우선순위가 높아서 그래 ㅜㅜ 그래서 필드 앞에 this를 붙여주는거란다~ 
    
    //여기서퀘스쳔 왜 중요한 몇개의 값만 생성자에서 초기화를 해줘야 하는걸까...?? 무슨 관련이 있는감..? 말 그대로 필드 선언할때 초기화를 하거나 
   //생성자 내부에서 임의의값으로 된다데 흠 우리 이유를 알아보자.
    
    //외부에서 제공되는 다양한 값으로 객체를 초기화 하기 위해 우리는 생성자를 만들어준다!! 클래스 변수를 건들면 그건 너무 직접적이잖아
    // 그러니까 생성자를 만들어서 거기서 접근해서 니가 만든 객체 값 갖고가라~ 이런 의미지.
    
    //아아 생성자 오버로딩은 이래서 하는거구나! 예를들어서 그냥 기본 값만 가져가고 싶기도 하고, 어쩔땐 색깔이랑 차종만 받고싶고 어쩔땐 스피드만 받고싶어
    //근데 생성자 하나에 다 몰아넣으면, 무시하고 싶은 값들도 초기화를 해줘야 하잖아..그래서 입맛대로 골라먹으라고 여러가지 경우의수처럼 만들어서
    //니가 필요한 생성자 골라서 초기화 하세요~ 이런 의미지. 
    public Dog(String name, String breed,
                   int age, String color)
    {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }
 
    // method 1
    public String getName()
    {
        return name;
    }
 
    // method 2
    public String getBreed()
    {
        return breed;
    }
 
    // method 3
    public int getAge()
    {
        return age;
    }
 
    // method 4
    public String getColor()
    {
        return color;
    }
 
    @Override
    public String toString()
    {
        return("Hi my name is "+ this.getName()+
               ".\nMy breed,age and color are " +
               this.getBreed()+"," + this.getAge()+
               ","+ this.getColor());
    }
 
    public static void main(String[] args)
    {
        Dog tuffy = new Dog("tuffy","papillon", 5, "white");
        System.out.println(tuffy.breed);
        Dog shaggy = new Dog("Shaggy","Lasaohapso", 9, "Black");
        System.out.println(tuffy.toString());
        System.out.println(shaggy.toString());
    }
}
