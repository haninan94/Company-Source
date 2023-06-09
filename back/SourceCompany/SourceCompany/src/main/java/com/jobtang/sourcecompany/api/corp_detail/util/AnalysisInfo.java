package com.jobtang.sourcecompany.api.corp_detail.util;

import com.jobtang.sourcecompany.api.corp_detail.dto.analysis_info.AnalysisInfoDetailDto;
import com.jobtang.sourcecompany.api.corp_detail.dto.analysis_info.AnalysisInfoDto;
import com.jobtang.sourcecompany.api.corp_detail.dto.analysis_info.AnalysisInfoValueDto;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class AnalysisInfo {

    public List<HashMap> getInfo(){
        return null;}}
//        return new ArrayList(List.of(
//                //유동성분석 101
//                AnalysisInfoDto.builder()
//                        .analysis_id("101")
//                        .analysis_name("유동성분석")
//                        .analysis_source("도서) 기업가치 중심의 경영분석 제4판- 김철중 저")
//                        .analysis_description(
//                                "<유동성분석>\n" +
//                                        "  - 기업의 단기채무 지급능력을 측정하기 위한 비율\n" +
//                                        "  1) 유동비율 : 기업의 단기채무 지급능력을 측정하기 위한 비율\n" +
//                                        "      양호 : 130% 이상 / 불량 : 130% 미만\n" +
//                                        "  2) 당좌비율 : 유동자산에서 재고자산을 차감한 자산인 당좌자산을 유동부채로 나눈 비율\n" +
//                                        "      양호 : 80% 이상 / 불량 : 80% 미만\n" +
//                                        "  3) 현금비율 : 현금및현금성자산을 유동부채로 나눈 비율, 유동성 비율 중 가장 보수적인 비율\n" +
//                                        "      양호 : 20% ~ 30% / 불량 : \n" +
//                                        "  4) 순운전자본비율 : 기업의 단기채무 지급능력을 측정하기 위한 비율\n" +
//                                        "      양호 : 산업평균 이상 / 불량 : 산업평균 미만"
//                        )
//                        .analysis_detail(
//                                new ArrayList(List.of(
//                                        new AnalysisInfoDetailDto().builder()
//                                                .category("1. 개념")
//                                                .value(new ArrayList(List.of(
//                                                        new AnalysisInfoValueDto().builder()
//                                                                .title("")
//                                                                .content("기업의 단기채무 지급능력을 측정하기 위한 비율")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("1) 유동비율")
//                                                                .content("단기채무 변제에 충당할 수 있는 유동자산이 얼마나 되는지 나타내는 비율(=은행가비율)")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("2) 당좌비율")
//                                                                .content("유동자산에서 재고자산을 차감한 자산인 당좌자산을 유동부채로 나눈 비율, 보다 유동성이 확보된 자산의 정보를 알 수 있음")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("3) 현금비율")
//                                                                .content("현금및현금성자산을 유동부채로 나눈 비율, 유동성 비율 중 가장 보수적인 비율")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("4) 순운전자본비율")
//                                                                .content("기업이 일정시점에서 보유하고 있는 유동자산에서 유동부채를 차감한 자본, 기업부실 예측모형의 투입변수로 많이 사용")
//                                                                .build()
//                                                ))).build()
//                                        ,new AnalysisInfoDetailDto().builder()
//                                                .category("2. 해석법")
//                                                .value(new ArrayList(List.of(
//                                                        new AnalysisInfoValueDto().builder()
//                                                                .title("1) 유동비율")
//                                                                .content("이론적으로 200% 정도면 안전, 현실적으로 130% 정도면 안전")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("2) 당좌비율")
//                                                                .content("이론적으로 100% 정도면 충분한 유동성 확보, 국내의 경우 80% 정도면 충분")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("3) 현금비율")
//                                                                .content("일반적으로 20~30% 정도가 적절, 지나치게 높을 시 수익성측면에서 불리")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("4) 순운전자본비율")
//                                                                .content("산업평균보다 높으면 양호")
//                                                                .build()
//                                                ))).build()
//                                        ,new AnalysisInfoDetailDto().builder()
//                                                .category("3. 계산법")
//                                                .value(new ArrayList(List.of(
//                                                        new AnalysisInfoValueDto().builder()
//                                                                .title("1) 유동비율 = 유동자산/유동부채 * 100")
//                                                                .content("")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("2) 당좌비율 = 당좌자산/유동부채 * 100 = (유동자산-재고자산)/유동부채 * 100")
//                                                                .content("")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("3) 현금비율 = 현금및현금성자산/유동부채 * 100")
//                                                                .content("")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("4) 순운전자본비율 = 순운전자본/총자산 * 100 = (유동자산-유동부채)/총자산 * 100")
//                                                                .content("")
//                                                                .build()
//                                                ))).build()
//
//                                ))
//                        )
//                        .build()
//
//                //자본배분의 안전성 분석 103
//                ,AnalysisInfoDto.builder()
//                        .analysis_id("103")
//                        .analysis_name("자본배분의 안전성 분석")
//                        .analysis_source("도서) 기업가치 중심의 경영분석 제4판- 김철중 저")
//                        .analysis_description(
//                                "<자본배분의 안전성 분석>\n" +
//                                        "  - 조달된 자본이 기업의 자산에 얼마나 적절히 배분되고 있는지를 측정하는 비율\n" +
//                                        "  1) 비유동비율(고정비율) : 기업의 단기채무 지급능력을 측정하기 위한 비율\n" +
//                                        "      양호 : 100% 이하 / 불량 : 100% 초과\n" +
//                                        "  2) 비유동장기적합률(고정장기적합률) : 유동자산에서 재고자산을 차감한 자산인 당좌자산을 유동부채로 나눈 비율\n" +
//                                        "      양호 : 100% 이하 / 불량 : 100% 초과\n"
//                        )
//                        .analysis_detail(
//                                new ArrayList(List.of(
//                                        new AnalysisInfoDetailDto().builder()
//                                                .category("1. 개념")
//                                                .value(new ArrayList(List.of(
//                                                        new AnalysisInfoValueDto().builder()
//                                                                .title("1) 비유동비율(고정비율)")
//                                                                .content("조달된 자본이 기업의 자산에 얼마나 적절히 배분되고 있는지를 측정하는 비율")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("2) 비유동장기적합률(고정장기적합률)")
//                                                                .content("기업이 장기적으로 경기변동, 시장여건 변화 등 경제변화에 잘 적응할 수 있는지를 검토하기 위한 비율")
//                                                                .build()
//                                                ))).build()
//                                        ,new AnalysisInfoDetailDto().builder()
//                                                .category("2. 해석법")
//                                                .value(new ArrayList(List.of(
//                                                        new AnalysisInfoValueDto().builder()
//                                                                .title("1) 비유동비율(고정비율)")
//                                                                .content("일반적인 기준은 100% 이하, 산업간 큰차이가 있음")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("2) 비유동장기적합률(고정장기적합률)")
//                                                                .content("100% 이하여야함.(장기자본=자기자본+비유동부채 범위 내에서 이루어져야하기 때문)")
//                                                                .build()
//                                                ))).build()
//                                        ,new AnalysisInfoDetailDto().builder()
//                                                .category("3. 계산법")
//                                                .value(new ArrayList(List.of(
//                                                        new AnalysisInfoValueDto().builder()
//                                                                .title("1) 비유동비율 = 비유동자산/자기자본 * 100")
//                                                                .content("")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("2) 비유동장기적합률 = 비유동자산/(자기자본+비유동부채)*100")
//                                                                .content("")
//                                                                .build()
//                                                ))).build()
//
//                                ))
//                        )
//                        .build()
//
//                //자산구성 분석 104
//                ,AnalysisInfoDto.builder()
//                        .analysis_id("104")
//                        .analysis_name("자산구성 분석")
//                        .analysis_source("도서) 기업가치 중심의 경영분석 제4판- 김철중 저")
//                        .analysis_description(
//                                "<자산구성 분석>\n" +
//                                        "- 유동산이 총자산 중에서 차지하는 비율\n" +
//                                        "  1) 유동자산구성비율 : 유동자산이 총자산 중에서 차지하는 비율\n" +
//                                        "      (주의, Company-Source만의 구분) 양호 : 산업평균 +- 20% / 불량 : 그 외\n" +
//                                        "  2) 유형자산구성비율 : 유형자산이 총자산 중에서 얼마나 차지하는 지를 나타낸 비율\n" +
//                                        "      (주의, Company-Source만의 구분) 양호 : 산업평균 +- 20% / 불량 : 그 외\n"
//                        )
//                        .analysis_detail(
//                                new ArrayList(List.of(
//                                        new AnalysisInfoDetailDto().builder()
//                                                .category("1. 개념")
//                                                .value(new ArrayList(List.of(
//                                                        new AnalysisInfoValueDto().builder()
//                                                                .title("")
//                                                                .content("유동산이 총자산 중에서 차지하는 비율")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("")
//                                                                .content("유동자산구성비율이 높을수록 기업의 단기채무 변제능력이 높아짐")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("1) 유동자산구성비율")
//                                                                .content("유동자산이 총자산 중에서 차지하는 비율")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("2) 유형자산구성비율")
//                                                                .content("유형자산이 총자산 중에서 얼마나 차지하는 지를 나타낸 비율")
//                                                                .build()
//                                                ))).build()
//                                        ,new AnalysisInfoDetailDto().builder()
//                                                .category("2. 해석법")
//                                                .value(new ArrayList(List.of(
//                                                        new AnalysisInfoValueDto().builder()
//                                                                .title("")
//                                                                .content("산업 종류에따라 적정수준이 다름")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("<아래는 적정수준을 Compan-Source에서 임의로 정의한 것>")
//                                                                .content("")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("1) 유동자산구성비율")
//                                                                .content("산업평균의 +- 20%, 양호, 그 외 보통")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("2) 유형자산구성비율")
//                                                                .content("산업평균의 +- 20%, 양호, 그 외 보통")
//                                                                .build()
//                                                ))).build()
//                                        ,new AnalysisInfoDetailDto().builder()
//                                                .category("3. 계산법")
//                                                .value(new ArrayList(List.of(
//                                                        new AnalysisInfoValueDto().builder()
//                                                                .title("1. 유동자산구성비율 = 유동자산/총자산 * 100")
//                                                                .content("")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("2. 유형자산구성비율 = 유형자산/총자산 * 100")
//                                                                .content("")
//                                                                .build()
//                                                ))).build()
//
//                                ))
//                        )
//                        .build()
//
//                //주가이익비율(PER) 분석 109
//                ,AnalysisInfoDto.builder()
//                        .analysis_id("109")
//                        .analysis_name("주가이익비율(PER)")
//                        .analysis_source("도서) 기업가치 중심의 경영분석 제4판- 김철중 저")
//                        .analysis_description(
//                                "<주가이익비율(PER)>\n" +
//                                        "- 주가수익비율이라고도 하며, 실제주가를 주당이익으로 나눈 것\n" +
//                                        "- (주의, Company-Source만의 구분) 양호 : 동종업계 이상 / 보통 : 그 외\n"
//                        )
//                        .analysis_detail(
//                                new ArrayList(List.of(
//                                        new AnalysisInfoDetailDto().builder()
//                                                .category("1. 개념")
//                                                .value(new ArrayList(List.of(
//                                                        new AnalysisInfoValueDto().builder()
//                                                                .title("")
//                                                                .content("1) 주가수익비율이라고도 하며, 실제주가를 주당이익으로 나눈 것")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("")
//                                                                .content("2) 주당이익이 평균일 때 주당이익이 높은 경우, 기업의 장래성이 좋으며, 성장하는 기업")
//                                                                .build()
//                                                ))).build()
//                                        ,new AnalysisInfoDetailDto().builder()
//                                                .category("2. 해석법")
//                                                .value(new ArrayList(List.of(
//                                                        new AnalysisInfoValueDto().builder()
//                                                                .title("")
//                                                                .content("1) 주가이익비율(PER)이 크다는 것은 기업의 미래 성장가능성이 높게 평")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("")
//                                                                .content("2) <아래는 적정수준을 Company-Source에서 임의로 정의한 것")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("")
//                                                                .content("3) 주가이익비율 : 동종업종보다 높으면 양호, 그 외 보통")
//                                                                .build()
//                                                ))).build()
//                                        ,new AnalysisInfoDetailDto().builder()
//                                                .category("3. 계산법")
//                                                .value(new ArrayList(List.of(
//                                                        new AnalysisInfoValueDto().builder()
//                                                                .title("- 주가이익비율(PER) = 실제주가/주당이익 = 시가총액/순이익")
//                                                                .content("")
//                                                                .build()
//                                                ))).build()
//
//                                ))
//                        )
//                        .build()
//
//        //주가순자산비율(PBR) 분석 110
//                ,AnalysisInfoDto.builder()
//                        .analysis_id("110")
//                        .analysis_name("주가순자산비율(PBR)")
//                        .analysis_source("도서) 기업가치 중심의 경영분석 제4판- 김철중 저")
//                        .analysis_description(
//                                "<주가순자산비율(PBR)>\n" +
//                                        "- 주가와 주당장부가치(주당 자기자본장부가치)를 비교하는 비율로서, 증권시장에서 평가된 주가와 주당장부가치를 비교하는 비율\n" +
//                                        " 고평가 : 동종업계 평균보다 낮은 경우 / 고평가 : 동종업계보다 높은 경우"
//                        )
//                        .analysis_detail(
//                                new ArrayList(List.of(
//                                        new AnalysisInfoDetailDto().builder()
//                                                .category("1. 개념")
//                                                .value(new ArrayList(List.of(
//                                                        new AnalysisInfoValueDto().builder()
//                                                                .title("")
//                                                                .content("1) 주가와 주당장부가치(주당 자기자본장부가치)를 비교하는 비율로서, 증권시장에서 평가된 주가와 주당장부가치를 비교하는 비율")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("")
//                                                                .content("2) 주가순자산비율(PBR)은 기업가치를 평가하는 승수로 이용되기도 하고, 주가의 적정성 여부를 판단하는 기준으로도 이용됨")
//                                                                .build()
//                                                ))).build()
//                                        ,new AnalysisInfoDetailDto().builder()
//                                                .category("2. 해석법")
//                                                .value(new ArrayList(List.of(
//                                                        new AnalysisInfoValueDto().builder()
//                                                                .title("")
//                                                                .content("    1) PBR이 동종업계 평균보다 낮다면\n" +
//                                                                        "        1) 저평가 되어있거나\n" +
//                                                                        "        2) 적정평가이지만 성장가능성이 동종업계보다 열등하다.\n")
//                                                                .build()
//                                                ))).build()
//                                        ,new AnalysisInfoDetailDto().builder()
//                                                .category("3. 계산법")
//                                                .value(new ArrayList(List.of(
//                                                        new AnalysisInfoValueDto().builder()
//                                                                .title("1) 주가순자산비율(PBR) = 시가총액 / 자기자본\n")
//                                                                .content("")
//                                                                .build()
//                                                ))).build()
//
//                                ))
//                        )
//                        .build()
//
//                //주가매출액비율(PSR) 분석 111
//                ,AnalysisInfoDto.builder()
//                        .analysis_id("111")
//                        .analysis_name("주가매출액비율(PSR) 분석")
//                        .analysis_source("도서) 기업가치 중심의 경영분석 제4판- 김철중 저")
//                        .analysis_description(
//                                "<주가매출액비율(PSR)>\n" +
//                                        "- 최근들어 벤처기업의 가치평가에서 PSR에 대한 관심이 증가하고 있음\n" +
//                                        " 고평가 : 동종업계 평균보다 낮은 경우 / 고평가 : 동종업계보다 높은 경우\n"
//                        )
//                        .analysis_detail(
//                                new ArrayList(List.of(
//                                        new AnalysisInfoDetailDto().builder()
//                                                .category("1. 개념")
//                                                .value(new ArrayList(List.of(
//                                                        new AnalysisInfoValueDto().builder()
//                                                                .title("")
//                                                                .content("1) 주가와 주당매출액을 비교하는 비율")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("")
//                                                                .content("2) 주가매출액비율(PSR)은 기업가치를 평가하는 승수로 이용되거나 주가의 적정성 여부를 판단하는 기준으로 이용됨")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("")
//                                                                .content("주가매출액비율(PSR)은 주가와 주당매출액을 비교하는 비율")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("")
//                                                                .content("최근들어 벤처기업의 가치평가에서 PSR에 대한 관심이 증가하고 있음")
//                                                                .build()
//                                                ))).build()
//                                        ,new AnalysisInfoDetailDto().builder()
//                                                .category("2. 해석법")
//                                                .value(new ArrayList(List.of(
//                                                        new AnalysisInfoValueDto().builder()
//                                                                .title("")
//                                                                .content("    - PSR이 동종업계 평균보다 낮다면\n" +
//                                                                        "        1) 저평가 되어있거나\n" +
//                                                                        "        2) 적정평가이지만 성장가능성이 동종업계보다 열등하다.\n")
//                                                                .build()
//                                                ))).build()
//                                        ,new AnalysisInfoDetailDto().builder()
//                                                .category("3. 계산법")
//                                                .value(new ArrayList(List.of(
//                                                        new AnalysisInfoValueDto().builder()
//                                                                .title("1) 주가매출액비율(PSR) = 실제주가/주당매출액 = 시가총액/매출액")
//                                                                .content("")
//                                                                .build()
//                                                ))).build()
//
//                                ))
//                        )
//                        .build()
//
//                //ROI 분석 113
//                ,AnalysisInfoDto.builder()
//                        .analysis_id("113")
//                        .analysis_name("ROI 분석")
//                        .analysis_source("도서) 기업가치 중심의 경영분석 제4판- 김철중 저")
//                        .analysis_description(
//                                "<ROI분석>\n" +
//                                        "- 유동산이 총자산 중에서 차지하는 비율\n" +
//                                        "  1) ROI : 총자본순이익률을 결정하는 각종 재무요인을 체계적으로 분석하여 기업의 재무계획 수립 및 통제에 활용하는 기법\n" +
//                                        "      양호 : 산업평균보다 높은 경우 / 불량 : 그 외\n" +
//                                        "  2) ROE : 자기자본순이익률\n" +
//                                        "      양호 : 산업평균보다 높은 경우 / 불량 : 그 외\n"
//                        )
//                        .analysis_detail(
//                                new ArrayList(List.of(
//                                        new AnalysisInfoDetailDto().builder()
//                                                .category("1. 개념")
//                                                .value(new ArrayList(List.of(
//                                                        new AnalysisInfoValueDto().builder()
//                                                                .title("1) ROI")
//                                                                .content("총자본순이익률을 결정하는 각종 재무요인을 체계적으로 분석하여 기업의 재무계획 수립 및 통제에 활용하는 기법")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("2) ROE")
//                                                                .content("자기자본순이익률")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("")
//                                                                .content("ROI분석은 기업의 재무 및 경영성과를 일목요연하게 파악할 수 있는 대표적 분석으로 미국 듀퐁사가 개발한 이후 기업의 재무통제 및 종합적 재무분석에 널리 활용되고 있음")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("")
//                                                                .content("ROI기법은 주주에게 귀속되는 자기자본순이익률(ROE)을 기준으로 한 평가에서 연장되어 활용될 수 있음")
//                                                                .build()
//                                                ))).build()
//                                        ,new AnalysisInfoDetailDto().builder()
//                                                .category("2. 해석법")
//                                                .value(new ArrayList(List.of(
//                                                        new AnalysisInfoValueDto().builder()
//                                                                .title("1) ROI")
//                                                                .content("산업평균보다 높으면 양호, 아니면 불량(개선할 여지가 있음)")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("2) ROE")
//                                                                .content("산업평균보다 높으면 양호, 아니면 불량")
//                                                                .build()
//                                                ))).build()
//                                        ,new AnalysisInfoDetailDto().builder()
//                                                .category("3. 계산법")
//                                                .value(new ArrayList(List.of(
//                                                        new AnalysisInfoValueDto().builder()
//                                                                .title("1) ROI = 순이익/매출액 * 매출액/총자산 = 매출액순이익률 * 총자산회전율 = 매출마진 * 총자산회전속도")
//                                                                .content("")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("2) ROE = ROI * (1+부채비율)")
//                                                                .content("")
//                                                                .build()
//                                                ))).build()
//
//                                ))
//                        )
//                        .build()
//
//                //Z-Score 분석 405
//                ,AnalysisInfoDto.builder()
//                        .analysis_id("405")
//                        .analysis_name("Z-Score 분석")
//                        .analysis_source("도서) 기업가치 중심의 경영분석 제4판- 김철중 저")
//                        .analysis_description(
//                                "<Z-Score분석>\n" +
//                                        "- 알트만(E. I. Altman)이 1946년부터 1965년 사이에 파산한 미국의 33개 제조기업과 이들 기업과 업종 및 규모 등이 유사한 정상적인 33개 제조기업을 추정 표본으로 개발한 모형\n" +
//                                        "(평가)\n" +
//                                        "  - 결과값 = Z\n" +
//                                        "  - Z ≤ 1.81 : 부실판정\n" +
//                                        "  - 1.81 ≤ Z ≤ 2.99 : 판정보류\n" +
//                                        "  - Z > 2.99 : 정상판정\n"
//                        )
//                        .analysis_detail(
//                                new ArrayList(List.of(
//                                        new AnalysisInfoDetailDto().builder()
//                                                .category("1. 개념")
//                                                .value(new ArrayList(List.of(
//                                                        new AnalysisInfoValueDto().builder()
//                                                                .title("")
//                                                                .content("1. 알트만(E. I. Altman)이 1946년부터 1965년 사이에 파산한 미국의 33개 제조기업과 이들 기업과 업종 및 규모 등이 유사한 정상적인 33개 제조기업을 추정 표본으로 개발한 모형")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("")
//                                                                .content("2. 정확도 : 추정표본에 대한 분류정확도는 도산 1년 전 자료인 경우 95%, 도산 2년전 자료인 경우 74%")
//                                                                .build()
//                                                ))).build()
//                                        ,new AnalysisInfoDetailDto().builder()
//                                                .category("2. 해석법")
//                                                .value(new ArrayList(List.of(
//                                                        new AnalysisInfoValueDto().builder()
//                                                                .title("")
//                                                                .content("    - 결과값 = Z\n" +
//                                                                        "    - Z ≤ 1.81 : 부실판정\n" +
//                                                                        "    - 1.81 ≤ Z ≤ 2.99 : 판정보류\n" +
//                                                                        "    - Z > 2.99 : 정상판정\n")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("")
//                                                                .content("")
//                                                                .build()
//                                                ))).build()
//                                        ,new AnalysisInfoDetailDto().builder()
//                                                .category("3. 계산법")
//                                                .value(new ArrayList(List.of(
//                                                        new AnalysisInfoValueDto().builder()
//                                                                .title("    Z = 0.012A + 0.014B + 0.033C + 0.006D + 0.0099E\n\n" +
//                                                                        "    변수)\n" +
//                                                                        "    A = 순운전자본 / 총자산\n" +
//                                                                        "    B = 이익잉여금 / 총자산 \n" +
//                                                                        "    C = EBIT / 총자산\n" +
//                                                                        "    D = 자기자본 시장가치 / 총부채\n" +
//                                                                        "    E = 매출액 / 총자산\n" +
//                                                                        "    EBIT = 이자 및 법인세 차감 전 순이익 = 순이익 + 이자비용 + 세금\n")
//                                                                .content("")
//                                                                .build()
//                                                ))).build()
//
//                                ))
//                        )
//                        .build()
//
//
//
//
//                //버전2
//
//                //레버리지 분석 102
//                ,AnalysisInfoDto.builder()
//                        .analysis_id("102")
//                        .analysis_name("레버리지 분석")
//                        .analysis_source("도서) 기업가치 중심의 경영분석 제4판- 김철중 저")
//                        .analysis_description(
//                                "<레버리지분석>\n" +
//                                        "1) 손익확대효과(재무레버리지효과)를 가져다 주는 타인자본 의존도\n" +
//                                        "2) 어느 정도 타인자본에 의존하고 있는지를 측정하는 비율, 부채성비율(안전성비율)\n" +
//                                        "3) 부채비율 : 타인자본(부채)을 자기자본으로 나눈 비율, 일반적으로 100% 이하를 표준비율로 보고있으며, 이는 여신자측의 채권회수의 안전성만 고려한 것\n" +
//                                        "      양호 : 산업평균보다 낮은 경우 / 불량 : 그 외\n" +
//                                        "4) 자기자본비율 : 총자본 중에서 자기자본이 차지하고 있는 비중을 나타내는 비율\n" +
//                                        "      양호 : 산업평균보다 낮은 경우 / 불량 : 그 외\n" +
//                                        "5) 차입금의존도 : 총자본 중에서 차입금이 차지하는 비중, 기업의 안전성을 측정하는 비율로 이용\n" +
//                                        "      양호 : 산업평균보다 낮은 경우 / 불량 : 그 외\n" +
//                                        "    - 차입금 대 매출액 비율 : 차입금이 매출액에 비해 얼마인가 나타내는 지표\n" +
//                                        "6) 차입금평균이자율 : 장단기차입금과 사채 등과 같은 이자발생부채에 대한 이자비용의 비율\n" +
//                                        "      양호 : 산업평균보다 높은 경우 / 불량 : 그 외\n" +
//                                        "7) 이자보상비율 : 영업이익이 타인자본을 사용하여 발생하는 이자비용의 몇 배에 해당하는지를 나타내는 비율\n" +
//                                        "      양호 : 산업평균보다 높은 경우 / 불량 : 그 외\n" +
//                                        "8) EBITDA / 이자비용비율과 고정재무비보상비율\n" +
//                                        "      양호 : 산업평균보다 높은 경우 / 불량 : 그 외\n" +
//                                        "    - EBITDA : 이자 및 법인세 차감전 순이익에 감가상각비 및 무형자산 상각비를 합친것(한국은행의 경우 EBIT = 세전순이익 + 이자비용)\n" +
//                                        "    - 고정재무비보상비율 : 이자보상비율을 확대시킨 비율, 영업이익을 이자비용 및 고정재무비의 합으로 나눈 비율"
//                        )
//                        .analysis_detail(
//                                new ArrayList(List.of(
//                                        new AnalysisInfoDetailDto().builder()
//                                                .category("1. 개념")
//                                                .value(new ArrayList(List.of(
//                                                        new AnalysisInfoValueDto().builder()
//                                                                .title("")
//                                                                .content("- 손익확대효과(재무레버리지효과)를 가져다 주는 타인자본 의존도")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("")
//                                                                .content("- 어느 정도 타인자본에 의존하고 있는지를 측정하는 비율, 부채성비율(안전성비율)")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("1) 부채비율")
//                                                                .content("타인자본(부채)을 자기자본으로 나눈 비율, 일반적으로 100% 이하를 표준비율로 보고있으며, 이는 여신자측의 채권회수의 안전성만 고려한 것")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("2) 자기자본비율")
//                                                                .content("총자본 중에서 자기자본이 차지하고 있는 비중을 나타내는 비율, 기업의 안전성을 측정하는 비율로 이용")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("3) 차입금의존도")
//                                                                .content("총자본 중에서 차입금이 차지하는 비중, 기업의 안전성을 측정하는 비율로 이용")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("4) 차입금평균이자율")
//                                                                .content("장단기차입금과 사채 등과 같은 이자발생부채에 대한 이자비용의 비율(분모는 기초와 기말 금액의 평균치 사용)")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("5) 이자보상비율")
//                                                                .content("영업이익이 타인자본을 사용하여 발생하는 이자비용의 몇 배에 해당하는지를 나타내는 비율, 기업의 부채수용능력을 보여줌")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("6) EBITDA / 이자비용비율과 고정재무비보상비율")
//                                                                .content("        - EBITDA : 이자 및 법인세 차감전 순이익에 감가상각비 및 무형자산 상각비를 합친것(한국은행의 경우 EBIT = 세전순이익 + 이자비용)\n" +
//                                                                        "        - 고정재무비보상비율 : 이자보상비율을 확대시킨 비율, 영업이익을 이자비용 및 고정재무비의 합으로 나눈 비율, 임차나 리스를 많이 이용하는 기업의 이자비용 및 고정재무비 지급능력을 측정하는 데 유용한 비율\n")
//                                                                .build()
//                                                ))).build()
//                                        ,new AnalysisInfoDetailDto().builder()
//                                                .category("2. 해석법")
//                                                .value(new ArrayList(List.of(
//                                                        new AnalysisInfoValueDto().builder()
//                                                                .title("1) 부채비율")
//                                                                .content("산업평균과 비교")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("2) 자기자본비율")
//                                                                .content("국제평균과 비교 ex) 한국 49.8%, 미국 42.3%, 일본 41.0%, 독일 29.3%")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("3) 차입금의존도")
//                                                                .content("산업평균 추이")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("4) 차입금평균이자율")
//                                                                .content("산업평균 비교, 추이")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("5) 이자보상비율")
//                                                                .content("일반적으로 적어도 3배 정도가 되어야 정상적인 지급활동 가능")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("6) EBIDTA/이자비용비율")
//                                                                .content("ex) 9.1배")
//                                                                .build()
//                                                ))).build()
//                                        ,new AnalysisInfoDetailDto().builder()
//                                                .category("3. 계산법")
//                                                .value(new ArrayList(List.of(
//                                                        new AnalysisInfoValueDto().builder()
//                                                                .title("1) 부채비율 = 부채/자기자본 * 100")
//                                                                .content("")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("2) 자기자본비율 = 자기자본/총자본 * 100")
//                                                                .content("")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("3) 차입금의존도 = (장단기 차입금 + 사채)/총자본 * 100")
//                                                                .content("")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("4) 차입금평균이자율 = 이자비용/(장단기차입금+사채)의 평잔 * 100")
//                                                                .content("")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("5) 이자보상비율 = 영업이익/이자비용 > (영업이익/총자본)/(이자비용/차입금)")
//                                                                .content("")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("6) EBITDA/이자비용비율 = EBITDA/이자비용 = (세전순이익 + 이자비용 + 감가상각비 및 무형자산상각비) / 이자비용")
//                                                                .content("")
//                                                                .build()
//                                                ))).build()
//
//                                ))
//                        )
//                        .build()
//
//                //수익성 분석 105
//                ,AnalysisInfoDto.builder()
//                        .analysis_id("105")
//                        .analysis_name("수익성 분석")
//                        .analysis_source("도서) 기업가치 중심의 경영분석 제4판- 김철중 저")
//                        .analysis_description(
//                                "<수익성분석>\n" +
//                                        "- 수익성이란 기업활동의 결과로 나타난 일정기간 동안의 경영성과\n" +
//                                        "1) 유동비율 : 단기채무 변제에 충당할 수 있는 유동자산이 얼마나 되는지 나타내는 비율(=은행가비율)\n" +
//                                        "      양호 : 130보다 높은 경우 / 불량 : 그 외\n" +
//                                        "2) 당좌비율 : 유동자산에서 재고자산을 차감한 자산인 당좌자산을 유동부채로 나눈 비율\n" +
//                                        "      양호 : 80보다 높은 경우 / 불량 : 그 외\n" +
//                                        "3) 재고자산회전율 : 연간 매출액을 재고자산으로 나눈 비율로 재고자산의 회전속도를 의미\n" +
//                                        "      양호 : 80보다 높은 경우 / 불량 : 그 외\n" +
//                                        "4) 총자산회전율(=총자본회전율) : 매출액을 총자산으로 나눈 비율\n" +
//                                        "      양호 : 산업평균 이상 높은 경우 / 보통 : 산업평균 * 0.8 이상 / 불량 : 그 외\n" +
//                                        "5) 매출액영업이익률 : 영업이익을 매출액으로 나눈 비율\n" +
//                                        "      양호 : 산업평균 이상 높은 경우 / 보통 : 그 외\n" +
//                                        "6) 총자본순이익률 (ROI) : 총자본순이익률을 결정하는 각종 재무요인을 체계적으로 분석하여 기업의 재무계획 수립 및 통제에 활용하는 기법\n" +
//                                        "      양호 : 산업평균보다 높은 경우 / 불량 : 그 외\n" +
//                                        "7) 총자산영업이익률 (ROA) :사후적인 투자 수익률로 총자산영업이익률과 평균이자율을 비교하는 것은 기업 부 변화를 이해하는 데 도움이 될 수 있음\n" +
//                                        "      양호 : 산업평균보다 높은 경우 / 불량 : 그 외\n" +
//                                        "8) 자기자본순이익률 (ROE) : 자기자본순이익률으로 ROI에서 확장한 개념\n" +
//                                        "      양호 : 산업평균보다 높은 경우 / 불량 : 그 외\n"
//                        )
//                        .analysis_detail(
//                                new ArrayList(List.of(
//                                        new AnalysisInfoDetailDto().builder()
//                                                .category("1. 개념")
//                                                .value(new ArrayList(List.of(
//                                                        new AnalysisInfoValueDto().builder()
//                                                                .title("")
//                                                                .content("- 손익확대효과(재무레버리지효과)를 가져다 주는 타인자본 의존도")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("")
//                                                                .content("- 어느 정도 타인자본에 의존하고 있는지를 측정하는 비율, 부채성비율(안전성비율)")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("1) 부채비율")
//                                                                .content("타인자본(부채)을 자기자본으로 나눈 비율, 일반적으로 100% 이하를 표준비율로 보고있으며, 이는 여신자측의 채권회수의 안전성만 고려한 것")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("2) 자기자본비율")
//                                                                .content("총자본 중에서 자기자본이 차지하고 있는 비중을 나타내는 비율, 기업의 안전성을 측정하는 비율로 이용")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("3) 차입금의존도")
//                                                                .content("총자본 중에서 차입금이 차지하는 비중, 기업의 안전성을 측정하는 비율로 이용")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("4) 차입금평균이자율")
//                                                                .content("장단기차입금과 사채 등과 같은 이자발생부채에 대한 이자비용의 비율(분모는 기초와 기말 금액의 평균치 사용)")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("5) 이자보상비율")
//                                                                .content("영업이익이 타인자본을 사용하여 발생하는 이자비용의 몇 배에 해당하는지를 나타내는 비율, 기업의 부채수용능력을 보여줌")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("6) EBITDA / 이자비용비율과 고정재무비보상비율")
//                                                                .content("        - EBITDA : 이자 및 법인세 차감전 순이익에 감가상각비 및 무형자산 상각비를 합친것(한국은행의 경우 EBIT = 세전순이익 + 이자비용)\n" +
//                                                                        "        - 고정재무비보상비율 : 이자보상비율을 확대시킨 비율, 영업이익을 이자비용 및 고정재무비의 합으로 나눈 비율, 임차나 리스를 많이 이용하는 기업의 이자비용 및 고정재무비 지급능력을 측정하는 데 유용한 비율\n")
//                                                                .build()
//                                                ))).build()
//                                        ,new AnalysisInfoDetailDto().builder()
//                                                .category("2. 해석법")
//                                                .value(new ArrayList(List.of(
//                                                        new AnalysisInfoValueDto().builder()
//                                                                .title("1) 부채비율")
//                                                                .content("산업평균과 비교 ex) 국내 제조업 평균 = 100.8%")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("2) 자기자본비율")
//                                                                .content("국제평균과 비교 ex) 한국 49.8%, 미국 42.3%, 일본 41.0%, 독일 29.3%")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("3) 차입금의존도")
//                                                                .content("산업평균 추이")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("4) 차입금평균이자율")
//                                                                .content("산업평균 비교, 추이\n" +
//                                                                        "        - ex) 제조업 96~98 : 11.22%, 10.59%, 13.51% / 2000년대 중반 : 7.6%, 6.8%, 5.8%, 7.2%\n")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("5) 이자보상비율")
//                                                                .content("일반적으로 적어도 3배 정도가 되어야 정상적인 지급활동 가능")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("6) EBIDTA/이자비용비율")
//                                                                .content("ex) 9.1배")
//                                                                .build()
//                                                ))).build()
//                                        ,new AnalysisInfoDetailDto().builder()
//                                                .category("3. 계산법")
//                                                .value(new ArrayList(List.of(
//                                                        new AnalysisInfoValueDto().builder()
//                                                                .title("1) 부채비율 = 부채/자기자본 * 100")
//                                                                .content("")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("2) 자기자본비율 = 자기자본/총자본 * 100")
//                                                                .content("")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("3) 차입금의존도 = (장단기 차입금 + 사채)/총자본 * 100")
//                                                                .content("")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("4) 차입금평균이자율 = 이자비용/(장단기차입금+사채)의 평잔 * 100")
//                                                                .content("")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("5) 이자보상비율 = 영업이익/이자비용 > (영업이익/총자본)/(이자비용/차입금) = 총자본영업이익률/차입금평균이자율")
//                                                                .content("")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("EBITDA/이자비용비율 = EBITDA/이자비용 = (세전순이익 + 이자비용 + 감가상각비 및 무형자산상각비) / 이자비용")
//                                                                .content("")
//                                                                .build()
//                                                ))).build()
//
//                                ))
//                        )
//                        .build()
//
//                // 활동성분석 106
//                ,AnalysisInfoDto.builder()
//                        .analysis_id("106")
//                        .analysis_name("활동성분석")
//                        .analysis_source("도서) 기업가치 중심의 경영분석 제4판- 김철중 저")
//                        .analysis_description(
//                                "<활동성분석>\n" +
//                                        "- 기업이 보유하고 있는 자원(자산, 자본 등)을 얼마나 효율적으로 활용하고 있는지를 나타내는 비율로서 매출액을 자원액으로 나눈 회전율로 측정함.\n" +
//                                        "1) 총자산회전율(=총자본회전율) : 매출액을 총자산으로 나눈 비율\n" +
//                                        "      양호 : 산업평균 이상 높은 경우 / 보통 : 산업평균 * 0.8 이상 / 불량 : 그 외\n" +
//                                        "2) 자기자본회전율 : 매출액을 자기자본으로 나눈 비율.\n" +
//                                        "      양호 : 산업평균 이상 높은 경우 / 보통 : 산업평균 * 0.8 이상 / 불량 : 그 외\n" +
//                                        "3) 비유동자산회전율(=고정자산회전율) : 매출액을 비유동자산으로 나눈 비율\n" +
//                                        "      양호 : 산업평균 이상 높은 경우 / 보통 : 산업평균 * 0.8 이상 / 불량 : 그 외\n" +
//                                        "4) 재고자산회전율 : 연간 매출액을 재고자산으로 나눈 비율로 재고자산의 회전속도를 의미\n" +
//                                        "      양호 : 산업평균 이상 높은 경우 / 보통 : 산업평균 * 0.8 이상 / 불량 : 그 외\n" +
//                                        "5) 매출채권회전율 : 매출액을 매출채권으로 나눈 비율로서 매출채권의 현금화 속도를 측정하는 비율\n" +
//                                        "      양호 : 산업평균 이상 높은 경우 / 보통 : 산업평균 * 0.8 이상 / 불량 : 그 외\n" +
//                                        "6) 매입채무회전율 : 매출액을 매입채무로 나눈 비율로서 매입채무의 지급속도를 측정하는 비율\n" +
//                                        "      양호 : 산업평균 이상 높은 경우 / 보통 : 산업평균 * 0.8 이상 / 불량 : 그 외\n"
//                        )
//                        .analysis_detail(
//                                new ArrayList(List.of(
//                                        new AnalysisInfoDetailDto().builder()
//                                                .category("1. 개념")
//                                                .value(new ArrayList(List.of(
//                                                        new AnalysisInfoValueDto().builder()
//                                                                .title("")
//                                                                .content("- 기업이 보유하고 있는 자원(자산, 자본 등)을 얼마나 효율적으로 활용하고 있는지를 나타내는 비율로서 매출액을 자원액으로 나눈 회전율로 측정함.")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("1) 총자산회전율(=총자본회전율)")
//                                                                .content("매출액을 총자산으로 나눈 비율, 총자산이 1년 동안 몇 번 회전했는지를 나타내는 비율로 총자산의 활용도를 총괄적으로 나타내는 지표")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("2) 자기자본회전율")
//                                                                .content("매출액을 자기자본으로 나눈 비율. 자기자본이 1년 동안 몇 번 회전했는지를 나타내는 비율로서 주주가 투자한 자본의 활용도를 나타내는 비율")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("3) 비유동자산회전율(=고정자산회전율)")
//                                                                .content("매출액을 비유동자산으로 나눈 비율. 비유동자산이 1년 동안 몇 번 회전했는지를 나타내는 비율로서 기업이 보유하고 있는 비유동자산의 활용도를 나타낸 비율")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("4) 재고자산회전율")
//                                                                .content("연간 매출액을 재고자산으로 나눈 비율로 재고자산의 회전속도를 의미, 재고자산이 일정기간 동안 당좌자산으로 몇 번이나 전환되었는지를 나타냄.")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("5) 매출채권회전율")
//                                                                .content("매출액을 매출채권으로 나눈 비율로서 매출채권의 현금화 속도를 측정하는 비율. 이 비율이 높다는 것은 매출채권이 잘 관리되고 매출채권의 현금화 속도가 빠르다는 것을 의미")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("6) 매입채무회전율")
//                                                                .content("매출액을 매입채무로 나눈 비율로서 매입채무의 지급속도를 측정하는 비율. 이 비율은 매입채무가 원활히 결제되고 있는지를 나타내는 지표")
//                                                                .build()
//                                                ))).build()
//                                        ,new AnalysisInfoDetailDto().builder()
//                                                .category("2. 해석법")
//                                                .value(new ArrayList(List.of(
//                                                        new AnalysisInfoValueDto().builder()
//                                                                .title("1) 총자산회전율")
//                                                                .content("산업평균이상시 양호, 산업평균+-20% 보통, 그 외 불량")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("2) 자기자본회전율")
//                                                                .content("산업평균이상시 양호, 산업평균+-20% 보통, 그 외 불량")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("3) 비유동자산회전율")
//                                                                .content("산업평균이상시 양호, 산업평균+-20% 보통, 그 외 불량")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("4) 재고자산회전율")
//                                                                .content("산업평균이상시 양호, 산업평균+-20% 보통, 그 외 불량")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("5) 매출채권회전율")
//                                                                .content("산업평균이상시 양호, 산업평균+-20% 보통, 그 외 불량")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("6) 매입채무회전율")
//                                                                .content("산업평균이상시 양호, 산업평균+-20% 보통, 그 외 불량")
//                                                                .build()
//                                                ))).build()
//                                        ,new AnalysisInfoDetailDto().builder()
//                                                .category("3. 계산법")
//                                                .value(new ArrayList(List.of(
//                                                        new AnalysisInfoValueDto().builder()
//                                                                .title("1) 총자산회전율 = 매출액/총자산(평잔)")
//                                                                .content("")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("2) 자기자본회전율 = 매출액/자기자본(평잔)")
//                                                                .content("")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("3) 비유동자산회전율 = 매출액/비유동자산(평잔)")
//                                                                .content("")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("4) 재고자산회전율 = 매출액/재고자산(평잔)")
//                                                                .content("")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("5) 매출채권회전율 = 매출액/매출채권(평잔)")
//                                                                .content("")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("6) 매입채무회전율 = 매출액/매입채무(평잔)")
//                                                                .content("")
//                                                                .build()
//                                                ))).build()
//
//                                ))
//                        )
//                        .build()
//
//                // 성장성분석 108
//                ,AnalysisInfoDto.builder()
//                        .analysis_id("108")
//                        .analysis_name("성장성분석")
//                        .analysis_source("도서) 기업가치 중심의 경영분석 제4판- 김철중 저")
//                        .analysis_description(
//                                "<성장성분석>\n" +
//                                        "- 기업의 당해 연도 경영 규모 및 성과가 전년도에 비하여 얼마나 증가하였는지를 나타내는 지표로 기업의 경쟁력이나 미래 수익창출능력을 간접적으로 나타내는 지표\n" +
//                                        "1) 매출액증가율 : 매출액이 전년도에 비해 당해 연도에 얼마나 증가하였는지를 나타내는 비율\n" +
//                                        "      (주의, Company-Source만의 구분) 양호 : 산업평균 이상 / 보통 : 산업평균 * 0.8 이상 / 불량 : 그 외\n" +
//                                        "2) 총자산증가율 : 기업에 투하되어 운영된 총자산이 전년도에 비하여 당해 연도에 얼마나 증가하였는지를 나타내는 비율\n" +
//                                        "      (주의, Company-Source만의 구분) 양호 : 산업평균 이상 / 보통 : 산업평균 * 0.8 이상 / 불량 : 그 외\n" +
//                                        "3) 자기자본증가율 : 자기자본이 전 연도에 비해 당해 연도에 얼마나 증가하였는지를 나타내는 지표.\n" +
//                                        "      (주의, Company-Source만의 구분) 양호 : 산업평균 이상 / 보통 : 산업평균 * 0.8 이상 / 불량 : 그 외\n" +
//                                        "4) 순이익증가율 : 기업활동의 최종성과인 순이익이 전년도에 비해 당해 연도에 얼마나 증가하였는지를 나타내는 비율\n" +
//                                        "      (주의, Company-Source만의 구분) 양호 : 산업평균 이상 / 보통 : 산업평균 * 0.8 이상 / 불량 : 그 외\n" +
//                                        "5) 주당이익증가율 : 주당이익(EPS)이 전년도에 비해 금년도에 얼마나 증가하였는지를 나타내는 지표.\n" +
//                                        "      (주의, Company-Source만의 구분) 양호 : 산업평균 이상 / 보통 : 산업평균 * 0.8 이상 / 불량 : 그 외\n" +
//                                        "6) 지속가능성장률 : 기업이 보유한 잠재성장률을 의미\n" +
//                                        "      (주의, Company-Source만의 구분) 양호 : 산업평균 이상 / 보통 : 산업평균 * 0.8 이상 / 불량 : 그 외\n"
//                        )
//                        .analysis_detail(
//                                new ArrayList(List.of(
//                                        new AnalysisInfoDetailDto().builder()
//                                                .category("1. 개념")
//                                                .value(new ArrayList(List.of(
//                                                        new AnalysisInfoValueDto().builder()
//                                                                .title("")
//                                                                .content("- 기업의 당해 연도 경영 규모 및 성과가 전년도에 비하여 얼마나 증가하였는지를 나타내는 지표로 기업의 경쟁력이나 미래 수익창출능력을 간접적으로 나타내는 지표")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("1) 매출액증가율")
//                                                                .content("매출액이 전년도에 비해 당해 연도에 얼마나 증가하였는지를 나타내는 비율로 기업의 외형적 신장세를 판단하는 대표적인 비율")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("2) 총자산증가율")
//                                                                .content("기업에 투하되어 운영된 총자산이 전년도에 비하여 당해 연도에 얼마나 증가하였는지를 나타내는 비율로서 기업의 전체적인 외형적 성장 규모를 측정하는 지표")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("3) 자기자본증가율")
//                                                                .content("자기자본이 전 연도에 비해 당해 연도에 얼마나 증가하였는지를 나타내는 지표. 장부가치 기준으로 주주의 부가 얼마나 늘었는지를 파악하는 성장지표.")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("4) 순이익증가율")
//                                                                .content("기업활동의 최종성과인 순이익이 전년도에 비해 당해 연도에 얼마나 증가하였는지를 나타내는 비율. 매출액 증가율이 외형적 성장세를 보여준다면 순이익증가율은 실질적 성장세를 보여주는 지표")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("5) 주당이익증가율")
//                                                                .content("주당이익(EPS)이 전년도에 비해 금년도에 얼마나 증가하였는지를 나타내는 지표. 순이익증가율의 보조지표로 이용되며, 주주에게 귀속되는 직접적인 주당이익의 증가세를 보여주는 지표")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("6) 지속가능성장률")
//                                                                .content("기업이 보유한 잠재성장률을 의미")
//                                                                .build()
//                                                ))).build()
//                                        ,new AnalysisInfoDetailDto().builder()
//                                                .category("2. 해석법")
//                                                .value(new ArrayList(List.of(
//                                                        new AnalysisInfoValueDto().builder()
//                                                                .title("")
//                                                                .content("<아래는 적정수준을 Compan-Source에서 임의로 정의한 것>")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("1) 매출액증가율")
//                                                                .content("산업평균이상시 양호, 산업평균+-20% 보통, 그 외 불량")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("2) 총자산증가율")
//                                                                .content("산업평균이상시 양호, 산업평균+-20% 보통, 그 외 불량")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("3) 자기자본증가율")
//                                                                .content("산업평균이상시 양호, 산업평균+-20% 보통, 그 외 불량")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("4) 순이익증가율")
//                                                                .content("산업평균이상시 양호, 산업평균+-20% 보통, 그 외 불량")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("5) 주당이익증가율")
//                                                                .content("산업평균이상시 양호, 산업평균+-20% 보통, 그 외 불량")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("6) 지속가능성장률")
//                                                                .content("산업평균이상시 양호, 산업평균+-20% 보통, 그 외 불량")
//                                                                .build()
//                                                ))).build()
//                                        ,new AnalysisInfoDetailDto().builder()
//                                                .category("3. 계산법")
//                                                .value(new ArrayList(List.of(
//                                                        new AnalysisInfoValueDto().builder()
//                                                                .title("1) 매출액증가율 = (당기 매출액 - 전기 매출액) / 전기 매출액 * 100")
//                                                                .content("")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("2) 총자산증가율 = (당기말 총자산- 전기말 총자산) / 전기말 매출액 * 100")
//                                                                .content("")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("3) 자기자본증가율 = (당기말 자기자본- 전기말 자기자본) / 전기말 자기자본 * 100")
//                                                                .content("")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("4) 순이익증가율 = (당기 순이익 - 전기 순이익) / 전기 순이익 * 100")
//                                                                .content("")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("5) 주당이익증가율 = (당기 주당이익- 전기 주당이익) / 전기 주당이익 * 100")
//                                                                .content("")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("6) 지속가능성장률 = 유보율 * 자기자본순이익률(ROE)")
//                                                                .content("")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("주당이익(EPS) = 당기순이익/주식 수")
//                                                                .content("")
//                                                                .build()
//                                                ))).build()
//
//                                ))
//                        )
//                        .build()
//
//                // 지수법분석 114
//                , AnalysisInfoDto.builder()
//                        .analysis_id("114")
//                        .analysis_name("지수법분석")
//                        .analysis_source("도서) 기업가치 중심의 경영분석 제4판- 김철중 저")
//                        .analysis_description(
//                                "<지수법분석>\n" +
//                                        "- 비율을 종합적으로 사용하여 기업을 분석하는 기법 중의 하나이며 재무분석에서 전통적으로 널리 이용되어 온 기법\n" +
//                                        "- 가중비율총합법이라고도 하며 월(A.Wall)에 의하여 최초로 제시된 종합적인 비율분석 방법.\n" +
//                                        "- 일반적으로 많이 사용되고 있는 지수법에는 월(A.Wall)의 지수법과 트랜트(J.B. Trant)의 및 브리체트(F. F. Brichett)의 지수법이 있음\n" +
//                                        "1) 월의 지수법은 재무유동성을 비롯한 재무 안정성을 중시하고 있어 여신자 입장에서의 분석이라 할 수 있음\n" +
//                                        "      양호 : 100점 이상 / 불량 : 그 외\n" +
//                                        "2) 트랜드의 지수법은 기업자산의 활용 정도인 활동성을 중시하고 있어 경영자 입장에서의 분석이라 할 수 있음\n" +
//                                        "      양호 : 100점 이상 / 불량 : 그 외\n" +
//                                        "3) 브리체트는 기업의 지급능력 분석시 분석 주체에 따라 관심영역이 조금씩 차이가 난다는 생각에서 주요 비율의 선정과 가중치 부여를 분석 주체에 따라 다르게 하였으며, 수익성비율도 주요 비율로 선정함\n" +
//                                        "      양호 : 100점 이상 / 불량 : 그 외\n"
//                        )
//                        .analysis_detail(
//                                new ArrayList(List.of(
//                                        new AnalysisInfoDetailDto().builder()
//                                                .category("1. 개념")
//                                                .value(new ArrayList(List.of(
//                                                        new AnalysisInfoValueDto().builder()
//                                                                .title("")
//                                                                .content("- 비율을 종합적으로 사용하여 기업을 분석하는 기법 중의 하나이며 재무분석에서 전통적으로 널리 이용되어 온 기법")
//                                                                .build()
//                                                        , new AnalysisInfoValueDto().builder()
//                                                                .title("")
//                                                                .content("- 가중비율총합법이라고도 하며 월(A.Wall)에 의하여 최초로 제시된 종합적인 비율분석 방법.")
//                                                                .build(),
//                                                        new AnalysisInfoValueDto().builder()
//                                                                .title("")
//                                                                .content("- 일반적으로 많이 사용되고 있는 지수법에는 월(A.Wall)의 지수법과 트랜트(J.B. Trant)의 및 브리체트(F. F. Brichett)의 지수법이 있음")
//                                                                .build()
//                                                        , new AnalysisInfoValueDto().builder()
//                                                                .title("")
//                                                                .content("1) 월의 지수법은 재무유동성을 비롯한 재무 안정성을 중시하고 있어 여신자 입장에서의 분석이라 할 수 있음")
//                                                                .build(),
//                                                        new AnalysisInfoValueDto().builder()
//                                                                .title("")
//                                                                .content("2) 트랜드의 지수법은 기업자산의 활용 정도인 활동성을 중시하고 있어 경영자 입장에서의 분석이라 할 수 있음")
//                                                                .build()
//                                                        , new AnalysisInfoValueDto().builder()
//                                                                .title("")
//                                                                .content("3) 브리체트는 기업의 지급능력 분석시 분석 주체에 따라 관심영역이 조금씩 차이가 난다는 생각에서 주요 비율의 선정과 가중치 부여를 분석 주체에 따라 다르게 하였으며, 수익성비율도 주요 비율로 선정함")
//                                                                .build()
//                                                ))).build()
//                                        , new AnalysisInfoDetailDto().builder()
//                                                .category("2. 해석법")
//                                                .value(new ArrayList(List.of(
//                                                        new AnalysisInfoValueDto().builder()
//                                                                .title("1) 월의 지수법 ")
//                                                                .content("100점 이상 시 양호, 그 외 불량")
//                                                                .build()
//                                                        , new AnalysisInfoValueDto().builder()
//                                                                .title("2) 트랜드의 지수법 ")
//                                                                .content("100점 이상 시 양호, 그 외 불량")
//                                                                .build()
//                                                        , new AnalysisInfoValueDto().builder()
//                                                                .title("3) 브리체트의 지수법")
//                                                                .content("100점 이상 시 양호, 그 외 불량")
//                                                                .build()
//                                                ))).build()
//                                        , new AnalysisInfoDetailDto().builder()
//                                                .category("3. 계산법")
//                                                .value(new ArrayList(List.of(
//                                                        new AnalysisInfoValueDto().builder()
//                                                                .title("")
//                                                                .content("- 공통 : 대상기업 = x, 산업평균 = y")
//                                                                .build()
//                                                        , new AnalysisInfoValueDto().builder()
//                                                                .title("1) 월의 지수법")
//                                                                .content("        0.25 * 유동비율 * x/y * 100 +\n" +
//                                                                        "        0.25 * 부채비율 * x/y * 100 +\n" +
//                                                                        "        0.15 * 비유동비율* x/y * 100 +\n" +
//                                                                        "        0.10 * 매출채권회전율 * x/y * 100 +\n" +
//                                                                        "        0.10 * 재고자산회전율 * x/y * 100 +\n" +
//                                                                        "        0.10 * 비유동자산회전율 * x/y * 100 +\n" +
//                                                                        "        0.05 * 자기자본회전율 * x/y * 100\n")
//                                                                .build()
//                                                        , new AnalysisInfoValueDto().builder()
//                                                                .title("2) 트랜드의 지수법")
//                                                                .content("        0.15 * 유동비율 * x/y * 100 +\n" +
//                                                                        "        0.10 * 부채비율 * x/y * 100 +\n" +
//                                                                        "        0.10 * 비유동비율* x/y * 100 +\n" +
//                                                                        "        0.10 * 매출채권회전율 * x/y * 100 +\n" +
//                                                                        "        0.20 * 재고자산회전율 * x/y * 100 +\n" +
//                                                                        "        0.20 * 비유동자산회전율 * x/y * 100 +\n" +
//                                                                        "        0.15 * 매입채무회전율 * x/y * 100\n")
//                                                                .build()
//                                                        , new AnalysisInfoValueDto().builder()
//                                                                .title("3) 브리체트의 지수법")
//                                                                .content( "        0.20 * 유동비율 * x/y * 100 +\n" +
//                                                                        "        0.20 * 당좌자산/유동자산 * x/y * 100 +\n" +
//                                                                        "        0.05 * 매출채권/재고자산 * x/y * 100 +\n" +
//                                                                        "        0.05 * 부채비율 * x/y * 100 +\n" +
//                                                                        "        0.10 * 재고자산회전율 * x/y * 100 +\n" +
//                                                                        "        0.25 * 매출채권회전율 * x/y * 100 +\n" +
//                                                                        "        0.05 * 총자산회전율 * x/y * 100 + \n" +
//                                                                        "        0.02 * 이자보상비율 * x/y * 100 +\n" +
//                                                                        "        0.02 * 매출액순이익률 * x/y * 100 +\n" +
//                                                                        "        0.02 * 총자산순이익률 * x/y * 100\n")
//                                                                .build()
//
//                                                ))).build()
//
//                                ))
//                        )
//                        .build()
//
//                //303
//                , AnalysisInfoDto.builder()
//                        .analysis_id("303")
//                        .analysis_name("현금흐름표분석(현금흐름과 주가비율)")
//                        .analysis_source("도서) 기업가치 중심의 경영분석 제4판- 김철중 저")
//                        .analysis_description(
//                                "<현금흐름표분석>\n" +
//                                        "- 현금흐름과 관련된 재무정보에는 주당현금흐름, 주가현금흐름비율(PCR), 배당지급능력배수 등이 대표적\n" +
//                                        "- 기업의 상환능력을 판단하는 데에도 현금흐름비율이 이용되고 있음\n" +
//                                        "1) 주당현금흐름 : 1주당 귀속되는 현금흐름\n" +
//                                        "2) 주가현금흐름비율 : 주가가 1주당 현금흐름의 몇 배로 형성되는지를 측정하는 상대적 가치 비율\n" +
//                                        "3) 배당지급능력배수 : 배당금의 몇 배만큼을 영업활동으로 인한 현금흐름으로 확보하고 있는지를 측정하는 비율\n" +
//                                        "4) 현금흐름 대 차입금 비율 : 영업활동으로 인한 현금흐름을 상환해야 하는 차입금과 비교하는 비율\n" +
//                                        "5) 현금흐름 대 총부채 비율 : 기업의 영업활동으로 인한 현금흐름을 총 부채와 비교하는 비율\n" +
//                                        "6) 현금흐름이자보상비율 : 영업활동으로 인한 현금흐름(이자비용 지급전)이 기업의 이자비용이 충분히 보상하는지를 판단하는데 이용됨."
//                        )
//                        .analysis_detail(
//                                new ArrayList(List.of(
//                                        new AnalysisInfoDetailDto().builder()
//                                                .category("1. 개념")
//                                                .value(new ArrayList(List.of(
//                                                        new AnalysisInfoValueDto().builder()
//                                                                .title("")
//                                                                .content("- 현금흐름과 관련된 재무정보에는 주당현금흐름, 주가현금흐름비율(PCR), 배당지급능력배수 등이 대표적")
//                                                                .build()
//                                                        , new AnalysisInfoValueDto().builder()
//                                                                .title("1) 주당현금흐름")
//                                                                .content("1주당 귀속되는 현금흐름을 의미하며 주가현금흐름이 많을 수록 주주의 가치가 커짐")
//                                                                .build()
//                                                        , new AnalysisInfoValueDto().builder()
//                                                                .title("2) 주가현금흐름비율 ")
//                                                                .content("주가가 1주당 현금흐름의 몇 배로 형성되는지를 측정하는 상대적 가치 비율로 이 비율이 상대적으로 낮다는 것은 주식가치가 고평가 되었음을 의미")
//                                                                .build()
//                                                        , new AnalysisInfoValueDto().builder()
//                                                                .title(" 3) 배당지급능력배수")
//                                                                .content("배당금의 몇 배만큼을 영업활동으로 인한 현금흐름으로 확보하고 있는지를 측정하는 비율로 1년 동안 창출한 영업활동으로 인한 현금흐름이 배당으로 지급한 금액의 몇 배인가 측정하는 비율")
//                                                                .build()
//                                                        , new AnalysisInfoValueDto().builder()
//                                                                .title("4) 현금흐름 대 차입금 비율")
//                                                                .content("영업활동으로 인한 현금흐름을 상환해야 하는 차입금과 비교하는 비율, 현금흐름 대 차입금 비율이 높을수록 기업의 상환능력이 크므로, 이 비율을 상환능력비율이라고도 함")
//                                                                .build()
//                                                        , new AnalysisInfoValueDto().builder()
//                                                                .title("5) 현금흐름 대 총부채 비율")
//                                                                .content("기업의 영업활동으로 인한 현금흐름을 총 부채와 비교하는 비율로 비율이 높다는 것은 기업이 장, 단기적으로 갚아야 하는 총부채를 영업활동으로 얻는 현금흐름으로 충분히 갚을 수 있음을 의미")
//                                                                .build()
//                                                        , new AnalysisInfoValueDto().builder()
//                                                                .title("6) 현금흐름이자보상비율")
//                                                                .content("영업활동으로 인한 현금흐름(이자비용 지급전)이 기업의 이자비용이 충분히 보상하는지를 판단하는데 이용됨. 이 비율이 높다는 것은 기업이 영업활동을 통해 벌어들이는 현금흐름이 차입금을 사용함으로써 부담하는 이자비용을 충분히 커버할 수 있음을 의미")
//                                                                .build()
//                                                ))).build()
//                                        , new AnalysisInfoDetailDto().builder()
//                                                .category("2. 해석법")
//                                                .value(new ArrayList(List.of(
//                                                        new AnalysisInfoValueDto().builder()
//                                                                .title("")
//                                                                .content("비교기업과 함께 비교해서 볼 수 있다!")
//                                                                .build()
//
//                                                ))).build()
//                                        , new AnalysisInfoDetailDto().builder()
//                                                .category("3. 계산법")
//                                                .value(new ArrayList(List.of(
//                                                        new AnalysisInfoValueDto().builder()
//                                                                .title("1) 주당현금흐름")
//                                                                .content("주주현금흐름 / 발행주식수 = (당기순이익 + 현금의 유출이 없는 비용 - 현금의 유입이 없는 수익)")
//                                                                .build()
//                                                        , new AnalysisInfoValueDto().builder()
//                                                                .title("2) 주가현금흐름비율")
//                                                                .content("주가/주당현금흐름")
//                                                                .build()
//                                                        , new AnalysisInfoValueDto().builder()
//                                                                .title("3) 배당지급능력배수")
//                                                                .content("영업활동으로 인한 현금흐름 / 배당금")
//                                                                .build()
//                                                        , new AnalysisInfoValueDto().builder()
//                                                                .title("4) 현금흐름 대 차입금 비율")
//                                                                .content("영업활동으로 인한 현금흐름 / 차입금(평잔) * 100")
//                                                                .build()
//                                                        , new AnalysisInfoValueDto().builder()
//                                                                .title("5) 현금흐름 대 총부채 비율")
//                                                                .content("영업활동으로 인한 현금흐름 / 총부채(평잔) * 100")
//                                                                .build()
//                                                        , new AnalysisInfoValueDto().builder()
//                                                                .title("6) 현금흐름이자보상비율")
//                                                                .content("(영업활동으로 인한 현금흐름 + 이자비용) / 이자비용 * 100")
//                                                                .build()
//
//
//                                                ))).build()
//
//                                ))
//                        )
//                        .build()
//
//
//                // 한국은행 모형 408
//                ,AnalysisInfoDto.builder()
//                        .analysis_id("408")
//                        .analysis_name("한국은행 모형")
//                        .analysis_source("도서) 기업가치 중심의 경영분석 제4판- 김철중 저")
//                        .analysis_description(
//                                "<한국은행 모형>\n" +
//                                        "- 한국은행에서 1982년에 제조업을 대상으로 만든 판별모형\n" +
//                                        "- 분류 정확도는 97.7%\n" +
//                                        "(평가)\n" +
//                                        "  - 결과값 = Z\n" +
//                                        "  - Z ≤ 1.81 : 부실판정\n" +
//                                        "  - 1.81 ≤ Z ≤ 2.99 : 판정보류\n" +
//                                        "  - Z > 2.99 : 정상판정\n"
//                        )
//                        .analysis_detail(
//                                new ArrayList(List.of(
//                                        new AnalysisInfoDetailDto().builder()
//                                                .category("1. 개념")
//                                                .value(new ArrayList(List.of(
//                                                        new AnalysisInfoValueDto().builder()
//                                                                .title("")
//                                                                .content("1) 한국은행에서 1982년에 제조업을 대상으로 만든 판별모형\n")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("")
//                                                                .content("2) 분류 정확도는 97.7%\n")
//                                                                .build()
//                                                ))).build()
//                                        ,new AnalysisInfoDetailDto().builder()
//                                                .category("2. 해석법")
//                                                .value(new ArrayList(List.of(
//                                                        new AnalysisInfoValueDto().builder()
//                                                                .title("- 결과값 = D\n")
//                                                                .content("")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("- D < -1.597 : A그룹\n")
//                                                                .content("")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("- -1.597 ≤ D < 0.0380 : B그룹\n")
//                                                                .content("")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("- 0.0380 ≤ D < 1.673 : C그룹\n")
//                                                                .content("")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("- D ≥ 1.673 : D그룹\n")
//                                                                .content("")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("- A, B 그룹 = 건전그룹, C,D 그룹 = 불건전 그룹\n")
//                                                                .content("")
//                                                                .build()
//                                                ))).build()
//                                        ,new AnalysisInfoDetailDto().builder()
//                                                .category("3. 계산법")
//                                                .value(new ArrayList(List.of(
//                                                        new AnalysisInfoValueDto().builder()
//                                                                .title("D = 5.323 - 0.033V - 0.026W - 0.008X + 0.060Y - 0.004Z + 2.271A - 2.783B\n")
//                                                                .content("")
//                                                                .build()
//                                                        ,new AnalysisInfoValueDto().builder()
//                                                                .title("변수)\n")
//                                                                .content("    V = 자기자본/총자본\n" +
//                                                                        "    W = 유동자산/유동부채\n" +
//                                                                        "    X = (자기자본+비유동부채)/비유동자산 → 비유동장기적합률의 역수\n" +
//                                                                        "    Y = 순운전자본/총자산\n" +
//                                                                        "    Z = 세전순이익/자본금\n" +
//                                                                        "    A = 매출액/총자산\n" +
//                                                                        "    B = 매출액/경영자본 = 매출액/총자산 - 투자자산 - 건설중인자산 = 경영자본회전율\n")
//                                                                .build()
//                                                ))).build()
//                                        ,new AnalysisInfoDetailDto().builder()
//                                                .category("4. 단점")
//                                                .value(new ArrayList(List.of(
//                                                        new AnalysisInfoValueDto().builder()
//                                                                .title("- 제조업 대상의 분석법이라 타 산업에 적용에 오류가 있을 수 있음\n")
//                                                                .content("")
//                                                                .build()
//                                                ))).build()
//
//                                ))
//                        )
//                        .build()
//
//        ));
//    }
//}