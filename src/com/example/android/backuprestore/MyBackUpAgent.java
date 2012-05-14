package com.example.android.backuprestore;

import android.app.backup.BackupAgentHelper;
import android.app.backup.FileBackupHelper;

import java.io.File;

/**
 * MyBackUpAgent class
 *
 * @author alien_roger
 * @created at: 15.05.12 5:43
 */
class MyBackupAgent extends BackupAgentHelper {
	private static final String DB_NAME = "my_db";

	@Override
	public void onCreate() {
//		FileBackupHelper dbs = new FileBackupHelper(this, DB_NAME);
//		addHelper("dbs", dbs);

		FileBackupHelper hosts = new FileBackupHelper(this,
				"../databases/" + DB_NAME);
		addHelper(DB_NAME, hosts);
	}

	@Override
	public File getFilesDir() {
		File path = getDatabasePath(DB_NAME);
		return path.getParentFile();
	}
}

