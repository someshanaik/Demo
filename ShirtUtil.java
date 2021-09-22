class ShirtUtil{


public static void main(String[] args){   



Shirt ref = new Shirt();
ref.productId = 7894;
ref.type =  "casual";
ref.department = "men";
ref.fitType = "slim fit";
ref.color = "red";
ref.cost =999;

System.out.println("product id="+ref.productId+" "+"type="+ref.type+" "+"department="+ref.department+" "+"fit type="+ref.fitType+" "+"color="+ref.color+" "+"cost="+ref.cost);
ref.careinstruction();



Shirt ref1 = new Shirt();
ref1.productId = 461;
ref1.type =  "schoole bag";
ref1.department = "men";
ref1.fitType = "xxxx ";
ref1.color ="nevy blue";
ref1.cost =2999;

System.out.println("product id="+ref1.productId+" "+"type="+ref1.type+" "+"department="+ref1.department+" "+"fit type="+ref1.fitType+" "+"color="+ref1.color+" "+"cost="+ref1.cost);
ref1.bag();

Shirt ref2 = new Shirt();
ref2.productId = 369;
ref2.type =  "running shoes";
ref2.department = "men";
ref2.fitType = "xxxx";
ref2.color = "black";
ref2.cost =4999;

System.out.println("product id="+ref2.productId+" "+"type="+ref2.type+" "+"department="+ref2.department+" "+"fit type="+ref2.fitType+" "+"color="+ref2.color+" "+"cost="+ref2.cost);
ref2.shoe();

}
}