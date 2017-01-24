import com.xiaomi.data.zixun.tag.util.TagUtils;

import java.io.IOException;

/**
 * Created by wangtianju on 16-8-15.
 */
public class KeywordExtractorTest {
    public static void main(String[] args) throws IOException {
        String doc = "这一个星期大梅州春暖花开，艳阳高照让不少小伙伴都以为春天来了！ 出行的出行、工作的工作、游玩的游玩，连农民伯伯都开始下地为我们播种粮食 了。呼吸着春天的气息，感受着梅州湛蓝的天空和新鲜的空气，相信在梅州的朋 友都有这种感觉以为梅州的春天要来了，但是·····小编要给你们当头一棒，因为这样的日子只剩几天咯，新一轮冷空气袭来！ 全世界的女性节日，妇女>节当天天气都还是很不多的，不过妇女节后就要面对5-10°的降温了，所以亲们 \n" +
                "不要着急的把棉袄锁在衣柜了，还是要拿出来穿的呀！ 而且此次降温将会带比较长一段时间的阴雨天气，内裤不干的日子可能要持续7-10天左右，小伙伴> 们趁这几天比较好的天气赶紧把挤压的衣服都洗洗吧！当然土豪的世界我们就不懂了······去买吧！那今天就唠这么多，没订阅的一点要点订阅哦！ 世界客都 · 中国梅州，每天为你带来梅州最新最好玩的头条资讯，赶紧订阅哦！";

        System.out.println(TagUtils.splitWords(doc).size());
        System.out.println(TagUtils.splitWords(doc));
        System.out.println(TagUtils.generateBiGram(doc));
    }
}
