import java.awt.Component;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;



public class Frugt_array {
	private ArrayList<Frugt> frugt_array;
	private String name;
	private String vægt;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frugt_array window = new Frugt_array();
					window.hentlist();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Frugt_array(){
		frugt_array = new ArrayList<Frugt>();
		hentlist();
	}

	public void hentlist(){
		try{
			FileInputStream fstream = null;
			fstream = new FileInputStream("frugt.data");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			while ((strLine = br.readLine()) != null){
				StringTokenizer st = new StringTokenizer(strLine, ",");
				name = null;
				vægt = null;
				name = st.nextToken();
				vægt = st.nextToken();
				frugt_array.add(new Frugt(name, vægt));
			}
		}catch(IOException e){
			System.out.println("fejl");
		}
	}
	
	public int getSize() {
		return frugt_array.size();
	}
	
	public Frugt getObject(int i) {
		return frugt_array.get(i);
	}
}



