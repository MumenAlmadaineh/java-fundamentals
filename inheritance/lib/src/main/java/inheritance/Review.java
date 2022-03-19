package inheritance;

public class Review {

    String bodyOfReview;
    String authorOfReview;
    int numberOfStarsForReview;

    public Review(String bodyOfReview, String authorOfReview, int numberOfStarsForReview) {
        this.bodyOfReview = bodyOfReview;
        this.authorOfReview = authorOfReview;
        this.numberOfStarsForReview = numberOfStarsForReview;
    }

    public String getBodyOfReview() {
        return bodyOfReview;
    }

    public void setBodyOfReview(String bodyOfReview) {
        this.bodyOfReview = bodyOfReview;
    }

    public String getAuthorOfReview() {
        return authorOfReview;
    }

    public void setAuthorOfReview(String authorOfReview) {
        this.authorOfReview = authorOfReview;
    }

    public int getNumberOfStarsForReview() {
        return numberOfStarsForReview;
    }

    public void setNumberOfStarsForReview(int numberOfStarsForReview) {
        this.numberOfStarsForReview = numberOfStarsForReview;
    }

    @Override
    public String toString() {
        return "Review{" +
                "bodyOfReview='" + bodyOfReview + '\'' +
                ", authorOfReview='" + authorOfReview + '\'' +
                '}';
    }
}
