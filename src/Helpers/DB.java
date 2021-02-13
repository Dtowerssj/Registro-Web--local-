package Helpers;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Controllers.Usuario;


public class DB {

	private String url="jdbc:postgresql://localhost:5432/Registro";
	private String uname="postgres";
	private String password="17camarones";
	private String driver="org.postgresql.Driver";
	
	public void cargaDriver(String driver) {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	public Connection getConnection() {
		Connection con=null;
		
		try {
			con=DriverManager.getConnection(url, uname, password);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return con;
	}
	
	public String insert(Usuario user) {
		
		cargaDriver(driver);
		Connection con = getConnection();
		String result = "";
		
		String sql = "INSERT INTO public.datos("
				+"cedula, nombre, correo, birth, telefono, clave)"
				+"VALUES (?, ?, ?, ?, ?, ?)";
    
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, user.getCedula());
			ps.setString(2, user.getNombre());
			ps.setString(3, user.getCorreo());
			ps.setString(4, user.getBirth());
			ps.setString(5, user.getTelefono());
			ps.setString(6, user.getClave());
			ps.executeUpdate();
			result="{\"message\": \"Exito\", \"status\": 200 }";
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			result = "{\"message\": \"El Registro fue fallido\", \"status\": 503 }";
		}
		return result;
		
	}
}
