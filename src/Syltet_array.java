import java.awt.Component;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;



public class Syltet_array implements ingredient_array {
	private ArrayList<Syltet> syltet_array;
	private String name;
	private String vægt;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Syltet_array window = new Syltet_array();
					window.hentlist();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Syltet_array(){
		syltet_array = new ArrayList<Syltet>();
		hentlist();
	}

	public void hentlist(){
		try{
			FileInputStream fstream = null;
			fstream = new FileInputStream("syltet.data");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			while ((strLine = br.readLine()) != null){
				StringTokenizer st = new StringTokenizer(strLine, ",");
				name = null;
				vægt = null;
				name = st.nextToken();
				vægt = st.nextToken();
				syltet_array.add(new Syltet(name, vægt));
			}
		}catch(IOException e){
			System.out.println("fejl");
		}
	}
	public int getSize() {
		return syltet_array.size();
	}

	public Syltet getObject(int i) {
		return syltet_array.get(i);
	}
}



