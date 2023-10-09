package BookSorted;

public class Book{
    private String bookName;
    private Integer pageNo;
    private String writerName;
    private String publicationDate;

    Book(String bookName , Integer pageNo , String writerName , String publicationDate){
        this.bookName = bookName;
        this.pageNo = pageNo;
        this.writerName = writerName;
        this.publicationDate = publicationDate;

    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }
}
