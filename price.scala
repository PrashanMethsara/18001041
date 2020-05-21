object price extends App

{
   price(60)

  def price(m: Int) = {
    val e : Float = 24.95*0.6
    var x :Float
    if(m>50) {
          x=3 + (m-50)*0.75
         } 

     else{
       x=3
        } 
    
    print(e + x)

} 
}
