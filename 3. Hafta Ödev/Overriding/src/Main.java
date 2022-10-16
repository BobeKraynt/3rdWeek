public class Main {

	public static void main(String[] args) {
//		OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager ();
//		System.out.println(ogretmenKrediManager.calculate(1000));
		
		BaseKrediManager[] krediManagers = new BaseKrediManager[]
			{new OgretmenKrediManager(), new TarımKrediManager(), new OgrenciKrediManager()};
		
		for (BaseKrediManager krediManager: krediManagers) {
			System.out.println(krediManager.calculate(1000));
		}
	}
}
