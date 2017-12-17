package Grafo;
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.SingleGraph;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CreacionGrafo {
	
	public void GrafoEstaciones() throws IOException {
		BufferedReader br =null;
		try {
		 br=new BufferedReader(new FileReader("/Grafos_Proyecto_FInal/Data/M4_Estaciones.csv"));
		String line = br.readLine();
        while (null!=line) {
           String [] fields = line.split(",");
           System.out.println(Arrays.toString(fields));
           
          
           System.out.println(Arrays.toString(fields));
           
           line = br.readLine();
        }
        
     } catch (Exception e) {
        e.printStackTrace();
     } finally {
        if (br!=null) {
           br.close();
        }
     }
	}
}
