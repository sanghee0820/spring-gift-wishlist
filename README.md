# spring-gift-wishlist

## Step1 요구사항

상품을 추가하거나 수정하는 경우, 클라이언트로부터 잘못된 값이 전달될 수 있다. 잘못된 값이 전달되면 클라이언트가 어떤 부분이 왜 잘못되었는지 인지할 수 있도록 응답을 제공한다.

상품 이름은 공백을 포함하여 최대 15자까지 입력할 수 있다.
특수 문자
가능: ( ), [ ], +, -, &, /, _
그 외 특수 문자 사용 불가
"카카오"가 포함된 문구는 담당 MD와 협의한 경우에만 사용할 수 있다.

## 기능 구현 예정

- request 유효성 검사
    - 상품 id
        - [x] 상품의 id는 Null이면 안된다.
        - [x] 상품의 id는 0보다 작을 수 없다.
    - 상품 이름
        - [x] 상품의 이름은 Null이면 안된다.
        - [x] 상품의 이름은 15자를 넘어서는 안된다.
        - [x] 상품의 이름에는 ( ), [ ], +, -, &, /, _ 이외의 특수문자가 포함되어서는 안된다.
    - 상품 가격
        - [x] 상품의 가격은 Null이면 안된다.
        - [x] 상품의 가격은 0보다 작을 수 없다.
        - [x] 상품의 가격은 2,100,000,000원 보다 클 수 없다.
    - 상품 이미지
        - [x] 상품의 이미지는 Null이면 안된다.
        - [x] 상품의 이미지는 URL 형식이어야 한다.
- domain 유효성 검사
    - 상품 이름
        - [x] "카카오"가 포함된 문구는 담당 MD와 협의한 경우에만 사용할 수 있다.

---

## Step2 요구사항

사용자가 회원 가입, 로그인, 추후 회원별 기능을 이용할 수 있도록 구현한다.

회원은 이메일과 비밀번호를 입력하여 가입한다.
토큰을 받으려면 이메일과 비밀번호를 보내야 하며, 가입한 이메일과 비밀번호가 일치하면 토큰이 발급된다.
토큰을 생성하는 방법에는 여러 가지가 있다. 방법 중 하나를 선택한다.
(선택) 회원을 조회, 추가, 수정, 삭제할 수 있는 관리자 화면을 구현한다.

## 기능 구현 예정

- 회원 클래스
    - [x] 회원은 이메일과 비밀번호를 가진다.
- 회원 가입
    - [x] 이메일과 비밀번호를 입력하여 가입한다.
    - [x] 이메일은 중복될 수 없다.
    - [x] 이메일은 이메일 형식이어야 한다.
    - [ ] 회원가입 시 비밀번호는 암호화하여 저장한다.
    - [x] 회원가입 시 토큰을 발급한다.
- 로그인
    - [x] 이메일과 비밀번호를 입력하여 로그인한다.
    - [x] 로그인 시 토큰을 발급한다.

## Step3 요구사항

이전 단계에서 로그인 후 받은 토큰을 사용하여 사용자별 위시 리스트 기능을 구현한다.

위시 리스트에 등록된 상품 목록을 조회할 수 있다.
위시 리스트에 상품을 추가할 수 있다.
위시 리스트에 담긴 상품을 삭제할 수 있다.

## 기능 구현 예정

- Interceptor
    - [ ] 로그인에 필요한 토큰을 검증한다
- HandlerMethodArgumentResolver
    - [ ] 토큰에서 변환한 정보를 User로 반환한다.
- 위시 리스트
    - [ ] 위시 리스트에 등록된 상품 목록을 조회할 수 있다.
    - [ ] 위시 리스트에 상품을 추가할 수 있다.
    - [ ] 위시 리스트에 담긴 상품을 삭제할 수 있다.