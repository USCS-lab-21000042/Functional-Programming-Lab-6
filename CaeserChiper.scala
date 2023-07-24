import scala.io.StdIn
object Tesst extends App{
    val alphabets: List[Char] = ('A' to 'Z').toList
    print("Enter shift number : ")
    var shift= scala.io.StdIn.readInt()
    print("Enter text : ")
    var text:Array[Char]= scala.io.StdIn.readLine().toArray
    var encript:Array[Char]= Array.fill(text.length)(' ')
    var decript:Array[Char]= Array.fill(text.length)(' ')
    def encription(text:Array[Char],shift:Int,count:Int=0):Unit={
        
        if(text.length >count){
            if(text(count)==' '){
                encript(count)=' '
            }
            else{
                encript(count) = alphabets((alphabets.indexOf(text(count)) + shift) % 26)    
            }
            encription(text,shift,count+1)
        }
        else
            println(s"Encripted text is :${encript.mkString("")}") 
            
    }

    def decription(text:Array[Char],shift:Int,count:Int=0):Unit={
        
        if(text.length >count){
            if(text(count)==' '){
                encript(count)=' '
            }
            else{
                decript(count)  = alphabets((alphabets.indexOf(text(count)) - shift) % 26)
            }
            decription(text,shift,count+1)
        }
        else
            println(s"Decripted text is:${decript.mkString("")}") 
            
    }
    encription(text,shift,count = 0)
    decription(encript,shift,count = 0)
    
    

}