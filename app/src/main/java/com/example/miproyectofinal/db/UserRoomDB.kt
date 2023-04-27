package com.example.miproyectofinal.db

@Database(entities = [UserEntity::class], version = 3)
abstract class UserRoomDB: RoomDatabase() {
}

    abstract fun userDao(): UserDao?

    companion object {
        private var INSTANCE: UserRoomDb?= null

        val migration_1_2: Migration = object: Migration(1, 2) {
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL("ALTER TABLE tblUser ADD COLUMN phone TEXT DEFAULT ''")
            }
        }

        fun getAppDatabase(context: Context): UserRoomDB? {

            if(INSTANCE == null ) {

                INSTANCE = Room.databaseBuilder<UserRoomDB>(
                    context.applicationContext, UserRoomDB::class.java, "AppDBB"
                )
                    .addMigrations(migration_1_2)
                    .allowMainThreadQueries()
                    .build()

            }
            return INSTANCE

        }
        fun destroyInstance() {
            INSTANCE = null
        }
    }
}