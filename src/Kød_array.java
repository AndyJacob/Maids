import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;



public class Kød_array {
	private ArrayList<Kød> kød_array;
	private String name;
	private String vægt;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kød_array window = new Kød_array();
					window.hentlist();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Kød_array(){
		kød_array = new ArrayList<Kød>();
		hentlist();
	}

	public void hentlist(){
		try{
			FileInputStream fstream = null;
			fstream = new FileInputStream("kød.data");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			while ((strLine = br.readLine()) != null){
				StringTokenizer st = new StringTokenizer(strLine, ",");
				name = null;
				vægt = null;
				name = st.nextToken();
				vægt = st.nextToken();
				kød_array.add(new Kød(name, vægt));
			}
		}catch(IOException e){
			System.out.println("fejl");
		}
	}
	public Kød getObject(int i) {
		return kød_array.get(i);
	}
	public int getSize() {
		return kød_array.size();
	}
}



