package Proxy.Caching;

public class MainAppCaching {
    public static void main(String[] args) {
        VideoDownloader videoDownloader = new ProxyVideoDownloader();
        videoDownloader.getVideo("xiaoling");
        videoDownloader.getVideo("xiaoling");
        videoDownloader.getVideo("likeNsub");
        videoDownloader.getVideo("likeNsub");
        videoDownloader.getVideo("xiaoling");
    }
}
