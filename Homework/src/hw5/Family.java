package hw5;

public class Family {

    private Human mother = new Human();
    private Human father = new Human();
    private Human[] children;
    private Pet pet = new Pet();
    private int indexForChildrenArray = 0;


    public Family(Human mother, Human father, int NumberOfChildren) {
        this.mother = mother;
        this.father = father;
        children = new Human[NumberOfChildren];
    }

    public void addChild(Human child) {
        if (indexForChildrenArray > children.length)
            throw new ArrayIndexOutOfBoundsException("No more children");
        else
            children[indexForChildrenArray++] = child;
    }

    public boolean deleteChild(int indexOfChildrenArray) {
        if (this.children == null || indexOfChildrenArray < 0 || indexOfChildrenArray > this.children.length - 1)
            return false;

        Human[] children2 = new Human[this.children.length - 1];

        for (int i = 0, k = 0; i < children.length; i++) {
            if (i == indexOfChildrenArray)
                continue;

            children2[k++] = this.children[i];
        }
        this.children = children2;

        return true;
    }

    public int countFamily() {
        int parents = 2;
        return parents + this.children.length;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }


    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public String Children() {
        String allChildren = "";

        for (Human child : children)
            allChildren += child.toString() + " ";

        return String.format(allChildren);
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother.toString() + "\n" +
                ", father=" + father.toString() + "\n" +
                ", children=" + Children() +
                ", pet=" + pet +
                '}';
    }
}