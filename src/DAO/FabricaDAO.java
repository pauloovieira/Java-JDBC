package DAO;

import db.DB;

public class FabricaDAO {

	public static VendedorDAO criarVendedorDAO() {
		return new VendedorDAOJDBC(DB.getConnection());
	}
}
