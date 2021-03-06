package com.example.navigation.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import java.util.concurrent.Executors

/**
 * Created by jiali on 2019-08-01.
 */
@Database(entities = [City::class], version = 1)
abstract class CityDb : RoomDatabase() {

    abstract fun cityDao(): CityDao

    companion object {
        private val IO_EXECUTOR = Executors.newSingleThreadExecutor()
        private var instance: CityDb? = null

        @Synchronized
        fun get(context: Context): CityDb {
            if (instance == null) {
                instance = Room.databaseBuilder(
                    context.applicationContext,
                    CityDb::class.java, "CityDatabase"
                ).addCallback(object : RoomDatabase.Callback() {
                    override fun onCreate(db: SupportSQLiteDatabase) {
                        IO_EXECUTOR.execute {
                            get(context).cityDao().insert(
                                CITY_DATA.map { City(id = 0, name = it) }
                            )
                        }
                    }
                }).build()
            }
            return instance!!
        }
    }
}

private val CITY_DATA = arrayListOf(
    "北京",
    "天津",
    "上海",
    "重庆",
    "石河子",
    "阿拉尔市",
    "图木舒克",
    "五家渠",
    "哈密",
    "吐鲁番",
    "阿克苏",
    "喀什",
    "和田",
    "伊宁",
    "塔城",
    "阿勒泰",
    "奎屯",
    "博乐",
    "昌吉",
    "阜康",
    "库尔勒",
    "阿图什",
    "乌苏",
    "呼和浩特",
    "包头",
    "乌海",
    "赤峰",
    "通辽",
    "鄂尔多斯",
    "呼伦贝尔",
    "巴彦淖尔",
    "乌兰察布",
    "霍林郭勒市",
    "满洲里市",
    "牙克石市",
    "扎兰屯市",
    "根河市",
    "额尔古纳市",
    "丰镇市",
    "锡林浩特市",
    "二连浩特市",
    "乌兰浩特市",
    "阿尔山市",
    "南宁",
    "柳州",
    "桂林",
    "梧州",
    "北海",
    "崇左",
    "来宾",
    "贺州",
    "玉林",
    "百色",
    "河池",
    "钦州",
    "防城港",
    "贵港",
    "岑溪",
    "凭祥",
    "合山",
    "北流",
    "宜州",
    "东兴",
    "桂平",
    "哈尔滨",
    "大庆",
    "齐齐哈尔",
    "佳木斯",
    "鸡西",
    "鹤岗",
    "双鸭山",
    "牡丹江",
    "伊春",
    "七台河",
    "黑河",
    "绥化",
    "五常",
    "双城",
    "尚志",
    "纳河",
    "虎林",
    "密山",
    "铁力",
    "同江",
    "富锦",
    "绥芬河",
    "海林",
    "宁安",
    "穆林",
    "北安",
    "五大连池",
    "肇东",
    "海伦",
    "安达",
    "长春",
    "吉林",
    "四平",
    "辽源",
    "通化",
    "白山",
    "松原",
    "白城",
    "九台市",
    "榆树市",
    "德惠市",
    "舒兰市",
    "桦甸市",
    "蛟河市",
    "磐石市",
    "公主岭市",
    "双辽市",
    "梅河口市",
    "集安市",
    "临江市",
    "大安市",
    "洮南市",
    "延吉市",
    "图们市",
    "敦化市",
    "龙井市",
    "珲春市",
    "和龙市",
    "沈阳",
    "大连",
    "鞍山",
    "抚顺",
    "本溪",
    "丹东",
    "锦州",
    "营口",
    "阜新",
    "辽阳",
    "盘锦",
    "铁岭",
    "朝阳",
    "葫芦岛",
    "新民",
    "瓦房店",
    "普兰",
    "庄河",
    "海城",
    "东港",
    "凤城",
    "凌海",
    "北镇",
    "大石桥",
    "盖州",
    "灯塔",
    "调兵山",
    "开原",
    "凌源",
    "北票",
    "兴城",
    "石家庄",
    "唐山",
    "邯郸",
    "秦皇岛",
    "保定",
    "张家口",
    "承德",
    "廊坊",
    "沧州",
    "衡水",
    "邢台",
    "辛集市",
    "藁城市",
    "晋州市",
    "新乐市",
    "鹿泉市",
    "遵化市",
    "迁安市",
    "武安市",
    "南宫市",
    "沙河市",
    "涿州市",
    "定州市",
    "安国市",
    "高碑店市",
    "泊头市",
    "任丘市",
    "黄骅市",
    "河间市",
    "霸州市",
    "三河市",
    "冀州市",
    "深州市"
)
