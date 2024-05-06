package class1;

public class MovieReviewMain {

    public static void main(String[] args) {
        //영화 리뷰 정보 선언
        MovieReview inception = new MovieReview();
        inception.title ="인셉션";
        inception.review = "재밌습니다.";
        MovieReview abouttime = new MovieReview();
        abouttime.title = "어바웃타임";
        abouttime.review = "어바웃타임은 재밌습니다.";
        //영화 리뷰 정보 출력
        MovieReview[] movieReviews = {inception, abouttime};
        for (MovieReview movieReview : movieReviews) {
            System.out.println("영화 제목 : " + movieReview.title + "영화 내용 : " + movieReview.review);
        }



    }
}
