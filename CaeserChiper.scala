import scala.compiletime.ops.int
import scala.io.StdIn
object Tesst extends App{
    val alphabets: List[Char] = ('A' to 'Z').toList
    // println("Enter shift number")
    // //println(alphabets.indexOf('C'))
    var shift= scala.io.StdIn.readInt()
    println("Enter text")
    var text:Array[Char]= scala.io.StdIn.readLine().toArray
    var encript:Array[Char]= Array.fill(text.length)(' ')
    var decript:Array[Char]= Array.fill(text.length)(' ')
    def encription(text:Array[Char],shift:Int,count:Int=0):Unit={
        
        if(text.length >count){
            if(text(count)==' '){
                encript(count)=' '
            }
            else{
                // var temp1:Char=text(count)
                // encript(count)=alphabets(alphabets.indexOf(temp1)+shift)
                val encryptedChar: Char = alphabets((alphabets.indexOf(text(count)) + shift) % 26)
                encript(count) = encryptedChar
            }
            encription(text,shift,count+1)
        }
        else
            println(encript.mkString("")) 
            
    }
    encription(text,shift,count = 0)
    
    

}