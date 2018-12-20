# MobileApp_Help_me
MobileApp programming team project 10 - Personal Law Application

1. Executive Summary

어느날 갑자기 당신이 사기를 당한다면? 혹은 고소를 당한다면?
 법과 같은 문제만큼 사람을 당황시키는 일은 별로 없을 것이다. 인터넷을 통해 검색을 하더라도, 정보가 너무 많고 어려운 용어가 많다. 심지어 복잡하기도 하여 너무 어렵게 느껴지는 분야가 법적인 문제이다. 그렇다고 변호사를 고용하기에는 너무 돈이 많이 든다.
 그러나, 이와 별개로, 우리는 일상생활에서 아주 흔하게 법적 문제를 만나게 된다. 교통사고, 이웃과의 마찰 등의 작은 사건부터 다른 큰 사건까지, 다양하고 방대한 여러 법적 문제들을 겪게 된다. 흔히 하는 어른들의 이야기 중에, 주변에 변호사 한명 정도는 알고 있어야 한다고 말하듯이 법적인 문제는 우리 주변에 흔하게 있으나, 접근하기는 어려운 문제임을 확인할 수 있다. 만약, 법률 정보를 알려주고, 이전 판례를 기반으로 정보를 알려준다면, 어려운 법적 문제를 해결할 수 있지 않을까? 이러한 생각으로 ‘도와줘’앱이 탄생하였다..

손 안의 개인 변호사!
 기존에 나와 같은 법적 문제가 발생한 사람이 한명도 없지는 않을 것이다. 그 사람들의 기존 판례를 참고한다면, 내가 무엇을 준비해야하는지, 어떻게 판결이 나는지 알 수 있다. 또한, 어떤 피해를 입었을 때, 어떻게 법적 판례가 났는지, 어떤 조항을 참고해야지 안다면 좀 더 법적문제와 가까워질 수 있다. 비싼 변호사 대신, 다양한 정보를 제공해주고 원하는 정보를 알려주는 나만의 변호사, ‘도와줘’를 사용하자.

어떻게 진행할 것인가?
 변호사나 검사조차도 헌법과 여러 법을 완벽하게 외우지 못하는 법이다. 그러나 방대한 양의 데이터베이스를 제공하여, 궁금한 법의 모든 정보를 알려준다. 최근 헌법재판소에서 제공하는 오픈 API와 공공데이터의 공개된 법률 정보, 판례 사례를 통해 다양한 데이터를 가지고 있어서 이를 이용한 발전된 형태의 서비스와 접근성 좋은 서비스를 구현할 것이다.

2. System Request
 1) 법률 정보
 2) 이전 판례 검색
 3) 주요 판결
 4) 분류에 따른 정보검색
 5) 법률 용어
 *) 법원 위치
 
3. Work Plan
 11.11 ~ 11.23 : Analysis & Design
 11.25 ~ 12.21 : Implement
 * 11.24 : 제안서 제출
 * 12.08 : 중간 보고
 * 12.10 ~ 12.14 : 기말고사
 * 12.22 : 최종 마감

4. Market Research
 통계청 정보에 따르자면 지난년도 소송 발생 횟수는 약 674만 건 정도라고 한다. 이는 대한민국 인구인 5147만과 비교를 해본다면, 100명 중 13명 정도가 소송을 경험할 수 있다고 해석할 수 있다. 즉, 이렇게 많은 소송이 매년 발생한다.
 변호사 수임료는 보통 300만원에서 500만 원 정도를 받는데, 통계청에서 제시한 임금 노동자의 한 달 평균 임금은 329만원이다. 임금 노동자의 한 달 임금보다도, 변호사 수임료가 많고 더 나아가, 추가적으로 발생하는 비용을 생각한다면 많은 임금 노동자들이 변호사를 선임할 여력이 없음을 확인할 수 있다.
 앞서 나온 두 자료를 비교하면, 100명 중에서 13명 정도가 발생할 정도로 주변에서 자주 발생하지만, 변호사를 선임할 비용도 만만하지 못하기에, 대부분 법 앞에 공정한 심판을 받지 못함을 확인할 수 있다. 이에, 많은 사람들에게 생소하고 어려운 법률에 대한 정보를 지원할 수 있다면 좋을 것이라는 생각이 들어 ‘도와줘’앱 개발을 진행하게 되었다.

5. Prototype Design

6. Git 활용법
 폴더를 사용자 개인 폴더 4개랑 Implement 폴더 하나를 해서, 개인 폴더에서는 자기가 개발하는 과정을 올리고 Implement는 1차 취합 및 2차 취합 때 합쳐보는 역할을 할 예정.  자기 폴더에 사용하는 기술이나, 작업 등을 꼭 기술문서에 명시해서 작성하고 후에 합칠 예정.


7. 개발 세분화(12.02 1차 파트 완료)
  : 메인 화면(문제에 관련된 글 검색해주기) - 박명훈
  : 디자인(팀에게 사진 및 디자인 공급) - 박명훈
  : 법률 정보 - 서영석
  : 이전 판례 검색 - 서영석
  : 주요 판결 - 윤영신
  : 분류에 따른 정보검색 - 윤영신
  : 법률 용어 - 권혁창
  : 법원 위치 – 권혁창
  * 개발 진행시에는 꼭 기술을 쓰면, 반드시 기술 문서를 써야하고, 12.02 자기에 git에 commit
  * 기술문서(코드 추가).
