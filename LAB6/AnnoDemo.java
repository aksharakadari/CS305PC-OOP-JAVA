class AnnoP{
      @Deprecated
      public void depM(){
      	System.out.println("Depricated Method..");
      	 
      }
      public void ovR(){
      		System.out.println("Annop");
      }
      
}
//@MyAnno
class AnnoC extends AnnoP{
		@Override
		public void ovR(){
		System.out.println("Annoc");
		}
}
public class AnnoDemo{
	@SuppressWarnings("deprecation")
	public static void main(String...args){
	
		AnnoC ac= new AnnoC();
		ac.ovR();
		ac.depM();
	}
}
