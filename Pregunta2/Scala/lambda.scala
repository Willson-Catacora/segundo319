object fiboE{
	def fibo (n : Int) : Int ={
		if (n == 1) return 0
		else if (n == 2) return 1
		else if (n == 3) return 1
		else return fibo(n-1) + fibo(n-2) + fibo(n-3) 
	} 

	def main(args:Array[String]):Unit={
		println("Fibonacci Funcion Temporal(lambda)")
		print("Introduzca un N : ")
		val n = scala.io.StdIn.readInt()
		var i = 1
		while(i <= n){
			val lambda = (i:Int) => fibo(i)
			print(lambda(i))
			print(", ")
			i = i + 1
		}
	}
}