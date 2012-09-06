import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;



public class Grønt_array {
	private ArrayList<Grønt> grønt_array;
	private String name;
	private String vægt;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Grønt_array window = new Grønt_array();
					window.hentlist();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Grønt_array(){
		grønt_array = new ArrayList<Grønt>();
		hentlist();
	}

	public void hentlist(){
		try{
			FileInputStream fstream = null;
			fstream = new FileInputStream("grønt.data");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			while ((strLine = br.readLine()) != null){
				StringTokenizer st = new StringTokenizer(strLine, ",");
				name = null;
				vægt = null;
				name = st.nextToken();
				vægt = st.nextToken();
				grønt_array.add(new Grønt(name, vægt));
			}
		}catch(IOException e){
			System.out.println("fejl");
		}
	}
	public int getSize() {
		return grønt_array.size();
	}

	public Grønt getObject(int i) {
		return grønt_array.get(i);
	}
}



