package bridgeDP;

public class ServerDataEngine extends DataEngine {

	public ServerDataEngine(IDBConnection dbConn) {
		super(dbConn);
	}

	@Override
	public void Execute(String sql) {
		System.out.println("Serverda komut çalıştırılıyor...");
		dbConnection.ExecuteSQL(sql);
	}

	@Override
	public void Open(String connStr) {
		System.out.println("Servera bağlanılıyor...");
		dbConnection.OpenConnection(connStr);
		
	}

}
