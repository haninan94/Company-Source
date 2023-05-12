import Question from "@/components/Question";
import "@/styles/globals.css";
import type { AppProps } from "next/app";
import * as gtag from "@/lib/gtag"
import { useRouter } from "next/router";
import { useEffect } from "react";
import Script from "next/script";
import { Provider } from "react-redux";
import store from "@/stores/store";

export default function App({ Component, pageProps }: AppProps) {

  const router = useRouter();
  useEffect(() => {
    const handleRouteChange = (url: any) => {
      gtag.pageview(url);
    };
    router.events.on('routeChangeComplete', handleRouteChange);
    router.events.on('hashChangeComplete', handleRouteChange);
    return () => {
      router.events.off('routeChangeComplete', handleRouteChange);
      router.events.off('hashChangeComplete', handleRouteChange);
    };
  }, [router.events]);
  // GA 설정 끝

  return (
    <>
      {/* Global Site Tag (gtag.js) - Google Analytics */}
      <Script strategy="afterInteractive" src={`https://www.googletagmanager.com/gtag/js?id=${gtag.GA_TRACKING_ID}`} />
      <Script
        id="gtag-init"
        strategy="afterInteractive"
        dangerouslySetInnerHTML={{
          __html: `
              window.dataLayer = window.dataLayer || [];
              function gtag(){dataLayer.push(arguments);}
              gtag('js', new Date());
              gtag('config', '${gtag.GA_TRACKING_ID}', {
                page_path: window.location.pathname,
              });
            `
        }}
      />
      <Provider store={store}>
        <Component {...pageProps} />
      </Provider>
      <Question />
    </>
  );
}
