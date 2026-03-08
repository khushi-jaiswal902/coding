export default async function Comment({params}) {
    const paramsObj = await params;
    const {blogID,commentID} = paramsObj;
    console.log(paramsObj);
    return (
    <div>Comment no <i>{commentID}</i> on <b>{blogID}</b> page</div>
    )
}
//http://localhost:3000/blogs/1/comments/10