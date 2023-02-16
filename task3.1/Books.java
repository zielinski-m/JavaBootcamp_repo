class Books {
    String title;
    String author;
    Integer pubDate;

    public Books(String title, String author,Integer pubDate) {
        this.title = title;
        this.author = author;
        this.pubDate = pubDate;
    }

    @Override
    public int hashCode() {
        return pubDate.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        Books e = (Books) o;
        return (title.equals(e.getTitle()) &&
                author.equals(e.getAuthor()) &&
                pubDate.equals(e.getPubDate()));
    }

    @Override
    public String toString() {
        return title + ", " + author + ", " + pubDate;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getPubDate() {
        return pubDate;
    }
}
