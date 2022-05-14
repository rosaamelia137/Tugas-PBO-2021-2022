class Kambing{
    private static String jenis_unggas = "kambing";
    private static int jumlah_kaki = 4;
    
    public static String getJenisUnggas(){
		return jenis_unggas;
	   }
	   
	public static int getJumlahKaki(){
		return jumlah_kaki;
	   }
	   
	private static void mbek(){
		System.out.println("Aku mbek");
	  }
   private static void berjalan(){
	   System.out.println("Aku berjalan");
     }
    
   public static void main(String [] args){
	   
	   System.out.println(
	   String.format("jenis unggas:%s",getJenisUnggas()));
	   
	   System.out.println(
	   String.format("jenis kaki:%s",getJumlahKaki()));
	   
	   mbek();
	   berjalan();
	 }
}
