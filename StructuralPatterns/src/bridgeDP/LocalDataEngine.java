package bridgeDP;

public class LocalDataEngine extends DataEngine {
	
	public LocalDataEngine(IDBConnection dbConn)
{
		super(dbConn);
}

	@Override
	public void Execute(String sql) {
		System.out.println("Localhostta komut çalıştırılıyor...");
		dbConnection.ExecuteSQL(sql);
		
	}

	@Override
	public void Open(String connStr) {
		System.out.println("Localhosta bağlanılıyor...");
		dbConnection.OpenConnection(connStr);
	}

}
