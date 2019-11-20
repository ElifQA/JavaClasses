package com.class21;

public class Forest {

	public static void main(String[] args) {
		Wolf wolf1=new Wolf();
		wolf1.color="brown";
		wolf1.age=5;
		wolf1.numberOfWolves++;
		
		Wolf wolf2=new Wolf();
		wolf2.color="white";
		wolf2.age=8;
		wolf2.numberOfWolves++;
		
		Wolf wolf3=new Wolf();
		wolf3.color="black";
		wolf3.age=4;
		wolf3.numberOfWolves++;
		
		Fox fox1=new Fox();
		fox1.color="gray";
		fox1.speed=568915;
		fox1.numberOfFoxes++;
		
		Fox fox2=new Fox();
		fox2.color="red";
		fox2.speed=568912;
		fox2.numberOfFoxes++;

		
		Fox fox3=new Fox();
		fox3.color="white";
		fox3.speed=265896;
		fox3.numberOfFoxes++;

		Bear bear1=new Bear();
		bear1.type="polar";
		bear1.weight=15;
		bear1.numberOfBears++;
		
		Bear bear2=new Bear();
		bear2.type="panda";
		bear2.weight=21;
		bear2.numberOfBears++;
		
		Bear bear3=new Bear();
		bear3.type="black bear";
		bear3.weight=56;
		bear3.numberOfBears++;
		
		System.out.println("The total number of foxes " +Fox.numberOfFoxes);
		System.out.println("The total number of wolves " +Wolf.numberOfWolves);
		System.out.println("The total number of bears " +Bear.numberOfBears);
		bear1.printInfo();
	}
	
	

}
