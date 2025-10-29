public class socialMediaFactory {
    // Cria um gerenciador (adapter) a partir do nome da plataforma e dos parâmetros de configuração
    public static gerenciadorMidiaSocial criar(String plataforma, java.util.Map<String,String> config) {
        if ("twitter".equalsIgnoreCase(plataforma)) {
            twitterApi api = new twitterApi(config.getOrDefault("token","token_default"));
            return new twitterAdapter(api);
        }
        if ("instagram".equalsIgnoreCase(plataforma)) {
            instagramApi api = new instagramApi(config.getOrDefault("clientId","id"), config.getOrDefault("clientSecret","secret"));
            return new instagramAdapter(api);
        }
        if ("linkedin".equalsIgnoreCase(plataforma)) {
            linkedinApi api = new linkedinApi(config.getOrDefault("apiKey","key"));
            return new linkedinAdapter(api);
        }
        if ("tiktok".equalsIgnoreCase(plataforma)) {
            tiktokApi api = new tiktokApi(config.getOrDefault("secret","secret"));
            return new tiktokAdapter(api);
        }
        return null;
    }
}

