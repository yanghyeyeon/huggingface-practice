## 어떤 문제를 해결하고싶은지 정의
    - 상품에 대한 리뷰글이 긍정적인지 부정적인지 알려주고 리뷰 내용을 요약해준다.
## 문제를 해결 할 수 있는 ai task 정리
    - 감정분석
    - 내용 요약
    - 한국어에서 영어로 번역
## task 별 모델들을 가져와 적합한 모델 찾기
    - cardiffnlp/twitter-roberta-base-sentiment-latest → 감정분석 모델
    - eenzeenee/t5-base-korean-summarization → 요약 모델
    - facebook/nllb-200-distilled-600M  → 번역 모델
### 요약을 해주고 감정 분석을 해줌(감정분석 모델이 영어이고 요약이 한글이여서 번역모델 필요함)
