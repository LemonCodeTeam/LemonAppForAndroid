package tk.twilightlemon.lemonapp;
/**
 *                             _ooOoo_
 *                            o8888888o
 *                            88" . "88
 *                            (| -_- |)
 *                            O\  =  /O
 *                         ____/`---'\____
 *                       .'  \\|     |//  `.
 *                      /  \\|||  :  |||//  \
 *                     /  _||||| -:- |||||-  \
 *                     |   | \\\  -  /// |   |
 *                     | \_|  ''\---/''  |   |
 *                     \  .-\__  `-`  ___/-. /
 *                   ___`. .'  /--.--\  `. . __
 *                ."" '<  `.___\_<|>_/___.'  >'"".
 *               | | :  `- \`.;`\ _ /`;.`/ - ` : | |
 *               \  \ `-.   \_ __\ /__ _/   .-` /  /
 *          ======`-.____`-.___\_____/___.-`____.-'======
 *                             `=---='
 *          ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
 *                     佛祖保佑        永无BUG
*/

import java.util.ArrayList;

public class InfoHelper {
    ///音乐播放信息
    public class Music
    {
        public Music() { }
        public String MusicName="";
        public String Singer ="";
        public String MusicID ="";
        public String ImageUrl ="";
        public String GC ="";
    }
    ///歌单列表数据
    public class MusicGData {
        public MusicGData(){}
        public ArrayList<Music> Data  = new ArrayList<>();
        public String name="";
        public String pic ="";
        public String id ="";
        public String sub="";
    }
}