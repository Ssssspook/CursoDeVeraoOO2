package br.ufjf.dcc.poo.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

	public class ConexaoMySql{

		private static String status = "Não conectado...";

		public static Connection criarConexao()
				throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {

			Connection connection = null;

			String serverName = "localhost"; // caminho do servidor do BD

			String mydatabase = "teste"; // nome do seu banco de dados

			String url = "jdbc:mysql://" + serverName + "/" + mydatabase;

			String username = "root"; // nome de um usuário de seu BD

			String password = "senhaOO123"; // sua senha de acesso

			connection = DriverManager.getConnection(url, username, password);

			Class.forName("com.mysql.jdbc.Driver");

	    //Testa a conexão com o banco
			if (connection != null) {
				status = ("STATUS: Conectado com sucesso!");
			} else {
				status = ("STATUS: Não foi possivel realizar conexão");
			}

			return connection;
		}
//		
//		public static ResultSet executarSelect(Connection conn, String sql) throws SQLException{
//			Statement query = conn.createStatement();
//			return query.executeQuery(sql);
//		}
//		
//		public static java.sql.PreparedStatement prepararSql(Connection conn, String sql) throws SQLException{
//			return conn.prepareStatement(sql);
//		}

		public static String statusConection() {
			return status;
		}

	}
